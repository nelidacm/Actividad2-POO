package Actividad2;

public class Automovil {

	String marca;
	String modelo;
	String nombreDueno;

	boolean estaEncendido;
	boolean estaAbierto;
	boolean estaVacio = true;

	int kilometraje = 0;
	int nivelCombustible = 0;
//	
//	public void ingresarDatos() {
//		marca = "BMW";
//		modelo = "Z3";
//		nombreDueno = "YO";
//	}

	public void llenarTanque() {
		estaVacio = false;
		nivelCombustible = 100;

	}

	public void escender() {
		if (estaVacio || nivelCombustible == 0) {
			System.err.println("ERROR: NO HAY COMBUSTIBLE");
		} else {
			System.out.println("auto encendido");
			estaEncendido = true;
		}
	}

	public void avanzar() {
		if (estaEncendido && !estaVacio) {
			kilometraje += 10;
			nivelCombustible -= 20;
			System.out.println("Avanzaste" + kilometraje + "km");

		} else {
			System.err.println("NO PUEDE AVANZAR");

		}

	}

	public String mostrarDatos() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", nombreDuenio=" + nombreDueno + ", estaEncendido="
				+ estaEncendido + ", estaAbierto=" + estaAbierto + ", estaVacio=" + estaVacio + ", kilometraje="
				+ kilometraje + ", nivelCombustible=" + nivelCombustible + "]";
	}

	public void abrirPuertas() {
		if(estaEncendido == false) {
			System.out.println("las puertas del auto se abrieron");
			
		}

	
	}
}
