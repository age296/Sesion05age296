package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class cursoSegunEdadTest {
	@CsvSource({
    "2017,1º Educación Infantil, true",
    "2016, 2º Educación Infantil, true",
	"2015, 3º Educación Infantil, true",
	"2014, 1º Educación Primaria, true",
	"2013, 2º Educación Primaria, true",
	"2012, 3º Educación Primaria, true",
	"2011, 4º Educación Primaria, true",
	"2010, 5º Educación Primaria, true",
	"2009, 6º Educación Primaria, true",
	"2008, 1º Educación Secundaria, true",
	"2007, 2º Educación Secundaria, true",
	"2006, 3º Educación Secundaria, true",
	"2005, 4º Educación Secundaria, true",
	"23123, Ha compleatado sus estudios,true"
	})
	
	@ParameterizedTest(name = "{index} => Con numero ({0}) y mensaje ({1}) sale {2}")
	void testLogin_parametrized(String numero, String curso, String result) {
	
		Alumno alumno = new Alumno();
		assertEquals(Boolean.parseBoolean(result), 
				curso.equals(alumno.cursoSegunEdad(Integer.parseInt(numero))));
		
	}
	
}
