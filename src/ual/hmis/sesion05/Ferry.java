package ual.hmis.sesion05;

import java.util.ArrayList;

public class Ferry {
	/* El Ferry transporta un
	conjunto de vehículos, y sus pasajeros. La clase Ferry tendrá atributos como: máximo
	número de pasajeros, peso máximo de vehículos, número total de pasajeros, número total
	de vehículos, peso total de vehículos. Además, el Ferry guardará la lista de vehículos que
	transporta*/
	private int numPasajerosMax;
	private int numVehiculosMax;
	private int pesoMax;
	private int numPasajeros;
	private int numVehiculos;
	private ArrayList<Vehiculo> vehiculos;
	
	public Ferry(int numPasajerosMax, int numVehiculosMax, int pesoMax, ArrayList<Vehiculo> vehiculos) {
		this.pesoMax = pesoMax;
		this.numVehiculosMax = numVehiculosMax;
		this.vehiculos = vehiculos;
		this.numPasajerosMax= numPasajerosMax;
		numPasajeros = 0;
		for(Vehiculo v: vehiculos) 
			numPasajeros += v.getNumPasajeros();
		numVehiculos = vehiculos.size();
	}
	
	boolean embarcarVehiculo(Vehiculo v) {
		numVehiculos++;
		numPasajeros+= v.getNumPasajeros();
		return vehiculos.add(v);
	}
	// Embarca un vehículo añadiéndolo a la lista
	int totalVehiculos() {
		return vehiculos.size();
	}
	// devuelve el número total de vehículos embarcados
	boolean vacio() {
		return vehiculos.size()==0;
	}
	// verdadero si no hay ningún vehículo
	boolean superadoMaximoVehiculos() {
		return numVehiculosMax<numVehiculos;
	}
	 // verdadero si el número total de los vehículos supera el máximo
	boolean superadoMaximoPeso() {
		int pesoMax = 0;
		for(Vehiculo vehiculo: vehiculos) {
			pesoMax += vehiculo.getPesoVehiculo(); 
		}
		return pesoMax>this.pesoMax;
	}
	 // verdadero si el peso total de los vehículos supera el máximo

	public int getNumMax() {
		return numPasajerosMax;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}

}
