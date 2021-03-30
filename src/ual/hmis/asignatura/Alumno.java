package ual.hmis.asignatura;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;
	
	/* Entre 0 y 4,9 Suspenso
	Entre 5 y 6,9 Aprobado
	Entre 7 y 8,9 Notable
	Entre 9 y 9,9 Sobresaliente
	10 Matrícula
	Menor que 0 ó mayor a 10 Error en la nota */
	public String calificacion(double nota) {
		if(nota > 0 && nota<5)
			return "Suspenso";
		else if(nota >= 5 && nota<7)
			return "Aprobado";
		else if(nota >= 7 && nota<9)
			return "Notable";
		else if(nota >= 7 && nota<9)
			return "Sobresaliente";
		else if(nota == 10)
			return "Sobresaliente";
		
	return "Error en la nota";
	}
	/*2017 1º Educación Infantil
	2016 2º Educación Infantil
	2015 3º Educación Infantil
	2014 1º Educación Primaria
	2013 2º Educación Primaria
	2012 3º Educación Primaria
	2011 4º Educación Primaria
	2010 5º Educación Primaria
	2009 6º Educación Primaria
	2008 1º Educación Secundaria
	2007 2º Educación Secundaria
	2006 3º Educación Secundaria
	2005 4º Educación Secundaria*/
	public String cursoSegunEdad (int anyoNacimiento) {
		switch(anyoNacimiento) {
		case 2017: return "1º Educación Infantil";
		case 2016: return "2º Educación Infantil";
		case 2015: return "3º Educación Infantil";
		case 2014: return "1º Educación Primaria";
		case 2013: return "2º Educación Primaria";
		case 2012: return "3º Educación Primaria";
		case 2011: return "4º Educación Primaria";
		case 2010: return "5º Educación Primaria";
		case 2009: return "6º Educación Primaria";
		case 2008: return "1º Educación Secundaria";
		case 2007: return "2º Educación Secundaria";
		case 2006: return "3º Educación Secundaria";
		case 2005: return "4º Educación Secundaria";
		default: return "Ha compleatado sus estudios";
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		double result = .0;
		for(Actividad actividades: actividadesAsignadas) {
			if(nombreActividad.equals(actividades.getNombre())){
				actividades.setPuntuacionTotal(.0);
				for(Ejercicio ejercicios:actividades.getEjercicios()) {
					result += ejercicios.getPuntuacion();
							
				}
				actividades.setPuntuacionTotal(result);
				break;
			}
		}
		
		return result;
		
	}

}
