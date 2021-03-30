package ual.hmis.sesion05;


import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {
	
	public <T extends Comparable<? super T>> List<T>  listaCadenasOrdenadas(ArrayList<T> a, ArrayList <T> b) {
		ArrayList<T> result = new ArrayList<T>();
		int contadorA = 0;
		int contadorB = 0;
		for(int i =0; i<(a.size() + b.size()); i++) {
			if(contadorA==a.size() && contadorB==b.size()) break;
			
			if(contadorA==a.size()) {
				result.add(b.get(contadorB));
				contadorB++;
				continue;
			}
			if(contadorB==b.size()) {
				result.add(a.get(contadorA));
				contadorA++;
				continue;
			}
			
			if(a.get(contadorA).compareTo(b.get(contadorB))<0) {
				result.add(a.get(contadorA));
				contadorA++;
			}
			else if(a.get(contadorA).compareTo(b.get(contadorB))>0) {
				result.add(b.get(contadorB));
				contadorB++;
			}
			else{
				result.add(a.get(contadorA));
				contadorA++;
				contadorB++;
				
			}
				
		}
		
		return result;
		
	}
}
