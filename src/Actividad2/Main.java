package Actividad2;

public class Main {

	public static void main(String[] args) {
		Automovil auto1 = new Automovil();
		//auto1
		auto1.marca = "BMW";
		auto1.modelo = "Z3";
		auto1.nombreDueno = "YO";
				
		auto1.llenarTanque();
		auto1.escender();
		auto1.mostrarDatos();
		
		//auto2
		Automovil auto2 = new Automovil();
		
		auto1.marca = "MERCEDES";
		auto1.modelo = "Z3";
		auto1.nombreDueno = "YO Y YO";
				
		auto1.llenarTanque();
		auto1.escender();
		auto1.mostrarDatos();
		
	}

}
