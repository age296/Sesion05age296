package ual.hmis.sesion05;


public class Ejercicio3 {
	public String devolverAsteriscos(Integer numero) {
		String result = "";
		if(numero<0)
			return "número erróneo";
		if(numero < 5) {
			for(int i = 0; i<5; i++)
				result+="*";
		}
		else if(numero>12) {
			for(int i = 0; i<12; i++)
				result+="*";
		}
		else {
			for(int i = 0; i<numero; i++)
				result+="*";
		}
		return result;
	}
}
