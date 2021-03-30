package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ejercicio10Test {
	static Stream<Arguments> StringToNumberProvider(){
		
		
		return Stream.of(
                Arguments.of("-5", -5),
                Arguments.of("+300", 300),
                Arguments.of("500", 500),
                Arguments.of("-20", -20),
                Arguments.of("32767", 32767),
                
                Arguments.of("2 3 5", null),
                Arguments.of("32768", null),
                Arguments.of("B3", null),
                Arguments.of("3.5", null)
              
                );
	}
	
    @ParameterizedTest(name = "{index} => String {0} result {1} ")
    @MethodSource("StringToNumberProvider")
    void  testWithExplicitLocalMethodSourceVehiculos(String v1, Integer result) {
    	Ejercicio10 e10 = new Ejercicio10();
    	assertEquals(e10.convertirCadenaEntero(v1), result);
    }

}