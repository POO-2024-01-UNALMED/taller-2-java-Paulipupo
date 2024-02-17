package test;

public class Asiento {
	String color;
	int registro, precio;
	
	void cambiarColor(String color) {
		if (color == "rojo" ||
			color == "verde" ||
			color == "amarillo" || 
			color == "negro" || 
			color == "blanco") {
			this.color = color;
		}
	}
}
