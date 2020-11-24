<<<<<<< HEAD
package vehiculos;

public class Moto extends VehiculoConRuedas {

	public Moto () {
		super();
	}
	
	public Moto(String modelo, String color, String matricula) {
		super(modelo, color, 2, matricula);
	}

	public Moto(String modelo, String color) {
		super(modelo, color, 2);
	}
}
=======
package vehiculos;

public class Moto extends VehiculoConRuedas {

	public Moto(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}

	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}

}
>>>>>>> 1fa568a36c5e8661f50af259ceb7c762f5acf50c
