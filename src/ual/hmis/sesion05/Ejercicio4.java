package ual.hmis.sesion05;


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
