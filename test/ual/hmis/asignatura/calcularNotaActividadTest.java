package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;



public class calcularNotaActividadTest {


	@Test
	public void testSumar() {
		Alumno age296 = new Alumno();
		ArrayList<Actividad> actividadesAsignadas = new ArrayList<Actividad>();
		for(int i = 0; i<3; i++) {
			actividadesAsignadas.add(new Actividad());
			actividadesAsignadas.get(i).setNombre("Actividad "+i);
			ArrayList<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
			for(int j = 0; j<3; j++) {
				ejercicios.add(new Ejercicio());
				ejercicios.get(j).setPuntuacion(Double.parseDouble(i+""));
			}
			actividadesAsignadas.get(i).setEjercicios(ejercicios);
		}
		age296.setActividadesAsignadas(actividadesAsignadas);
		
		assertEquals(age296.calcularNotaActividad("Actividad 0"), 0.0);
		assertEquals(age296.calcularNotaActividad("Actividad 1"), 3.0);
		assertEquals(age296.calcularNotaActividad("Actividad 2"), 6.0);
	}
}
