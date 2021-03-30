package ual.hmis.sesion05;

public class Ejercicio10 {
	public Integer convertirCadenaEntero(String numero) {
		
		Integer result;
		try {
			result = Integer.parseInt(numero);
			if(result <-32768 || result> 32767) return null;
			return result;
		}catch(Exception e) {
			return null;
		}
		
	}
}
