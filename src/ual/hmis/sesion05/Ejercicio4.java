package ual.hmis.sesion05;

/* Escriba el código de un método en Java que tome cómo parámetros de entrada dos
cadenas de caracteres, P1, P2, y devuelva otra cadena que contenga los caracteres de P1
que están en P2.*/

public class Ejercicio4 {
	public String palabrasContenidas(String P1, String P2) {
		String result = "";
		for(int i = 0; i<P1.length(); i++) {
			if(P2.indexOf(P1.charAt(i))>-1 && result.indexOf(P1.charAt(i))==-1) {
				result+= P1.charAt(i); 
			}
		}
		return result;
	}
}
