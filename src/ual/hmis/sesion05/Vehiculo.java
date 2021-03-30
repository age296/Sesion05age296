package ual.hmis.sesion05;

public class Vehiculo {
	//número de pasajeros,
	//número de ruedas, 
	//peso del vehículo con carga (Kg) (sin pasajeros). 
	private int numPasajeros;
	private int numRuedas;
	private int pesoVehiculo;
	public Vehiculo(int numPasajeros, int numRuedas, int pesoVehiculo) {
		this.numPasajeros = numPasajeros;
		this.numRuedas = numRuedas;
		this.pesoVehiculo = pesoVehiculo;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public int getPesoVehiculo() {
		return pesoVehiculo;
	}
	public void setPesoVehiculo(int pesoVehiculo) {
		this.pesoVehiculo = pesoVehiculo;
	}
	
}
