package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/*Escriba el código en Java de un método que tome un valor numérico entero cómo
parámetro de entrada y devuelva una valor tipo cadena de caracteres cuyo contenido
debe ser tantos caracteres ‘*’ (asteriscos) como indica el parámetro de entrada. Por
ejemplo, si el valor de entrada es 5 la cadena de salida sería ‘*****’. Si el valor de entrada
es negativo la cadena de salida debe contener el texto ‘número erróneo’. Si el valor de
entrada es menor que 5, mostrará 5 asteriscos, y si es mayor que 12, mostrará 12
asteriscos.*/
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
