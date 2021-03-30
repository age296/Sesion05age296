package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio4Test {
	@CsvSource({
		"hola, osa, oa, true",
		"holaaaa, osaaa, oa, true"
		})
	
	@ParameterizedTest(name = "{index} => Con P1 ({0}) y P2 ({1}) sale {2}, por tanto es {3}")
	void testLogin_parametrized(String P1, String P2, String cadenaFinal, String result) {
	
		Ejercicio4 e4 = new Ejercicio4();

		assertEquals(Boolean.parseBoolean(result), 
				cadenaFinal.equals(e4.palabrasContenidas(P1, P2)));
	}
	
}