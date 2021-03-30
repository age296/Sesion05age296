package ual.hmis.sesion05;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ejercicio8Test {
	static Stream<Arguments> VehiculosProvider(){
		return Stream.of(
                Arguments.of(new Vehiculo(3, 4, 200), new Vehiculo (2, 1,100),new Vehiculo (5, 5,300)),
                Arguments.of(new Vehiculo(3, 4, 200), new Vehiculo (5, 3,200), new Vehiculo(8, 7, 400))
            );
	}
	
    @ParameterizedTest(name = "{index} => sumar {0} con {1} sale {2}")
    @MethodSource("VehiculosProvider")
    void testWithExplicitLocalMethodSourceVehiculos(Vehiculo v1, Vehiculo v2, Vehiculo expected) {
        assertNotNull(v1);
        assertNotNull(v2);
        assertNotNull(expected);
        assertEquals(v1.getNumPasajeros(), 3);
        assertEquals(v1.getNumRuedas(), 4);
        assertEquals(v1.getPesoVehiculo(), 200);
        
   
        Vehiculo resultado = new Vehiculo(0,0,0);
        resultado.setNumPasajeros(v1.getNumPasajeros()+v2.getNumPasajeros());
        resultado.setNumRuedas(v1.getNumRuedas()+v2.getNumRuedas());
        resultado.setPesoVehiculo(v1.getPesoVehiculo()+v2.getPesoVehiculo());

        assertAll(
                () -> assertEquals(expected.getNumPasajeros(),     resultado.getNumPasajeros(), 0.0000001, "Falla la parte real"),
                () -> assertEquals(expected.getNumRuedas(),    	   resultado.getNumRuedas(), 0.0000001, "Falla la parte imaginaria"),
                () -> assertEquals(expected.getPesoVehiculo(),     resultado.getPesoVehiculo(), 0.0000001, "Falla la parte imaginaria")
                
                );
    }
    static Stream<Arguments> FerryProvider(){
    	return Stream.of(
                Arguments.of(new Ferry(1,  1, 200, new ArrayList<Vehiculo>())),
                Arguments.of(new Ferry(1,  1, 250, new ArrayList<Vehiculo>()))
            );
	}
    @ParameterizedTest(name = "{index} => Ferry {0} ")
    @MethodSource("FerryProvider")
    void testWithExplicitLocalMethodSourceFerryProvider(Ferry r1) {
    	
    	assertNotNull(r1);
        assertEquals(r1.getNumMax(), 1);
        assertEquals(r1.getNumPasajeros(), 0);
        // Ferry aun vacio 
        assertEquals(r1.vacio(), true);
        assertEquals(r1.totalVehiculos(), 0);
        // Añadimos vehiculos
        r1.embarcarVehiculo(new Vehiculo(3, 4, 200));
        assertEquals(r1.superadoMaximoVehiculos(), false);
        assertEquals(r1.superadoMaximoPeso(), false);
        r1.embarcarVehiculo(new Vehiculo(4, 6, 200));
        assertEquals(r1.superadoMaximoVehiculos(), true);
        assertEquals(r1.superadoMaximoPeso(), true);
        assertEquals(r1.totalVehiculos(), 2);
        assertEquals(r1.vacio(), false);
        
        // Porbando constructor con Vehiculos
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(new Vehiculo(2,100,10));
        Ferry test = new Ferry(1,  1, 5, vehiculos);
        assertEquals(test.superadoMaximoPeso(), true);
    }
}
