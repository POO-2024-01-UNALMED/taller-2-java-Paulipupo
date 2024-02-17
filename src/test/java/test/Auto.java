package test;

public class Auto {
	static int cantidadCreados;
	String modelo, marca;
	int precio, registro;
	Motor motor;
	Asiento[] asientos = {};
	
	int cantidadAsientos(){
		int contador = 0;
		for (int i = 0; i < this.asientos.length; i++ )
			if (asientos[i] != null) {
				contador += 1;
			}
		return contador;	
	}
	
	String verificarIntegridad(int verificar) {
		for (int i = 0; i < this.asientos.length; i++ )
			if (asientos[i] != null) {
				if (this.registro != asientos[i].registro)
					return "Las piezas no son originales";
			}
		if (this.registro != motor.registro) {
			return "Las piezas no son originales";
		}
		
		return "Auto original";
	}

}
	