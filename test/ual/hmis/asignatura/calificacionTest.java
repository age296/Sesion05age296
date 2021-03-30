package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class calificacionTest {
	@Test
	public void testCalificacion() {
		Alumno age296 = new Alumno();
		/*Entre 0 y 4,9 Suspenso
		Entre 5 y 6,9 Aprobado
		Entre 7 y 8,9 Notable
		Entre 9 y 9,9 Sobresaliente
		10 Matrícula
		Menor que 0 ó mayor a 10 Error en la nota */
		
		assertEquals(age296.calificacion(0), "Suspenso");
		assertEquals(age296.calificacion(5), "Aprobado");
		assertEquals(age296.calificacion(7), "Notable");
		assertEquals(age296.calificacion(9), "Sobresaliente");
		assertEquals(age296.calificacion(10), "Matrícula");
		assertEquals(age296.calificacion(-2), "Error en la nota");
		assertEquals(age296.calificacion(12), "Error en la nota");
	}
}
