package vehiculos;

public class Moto extends VehiculoConRuedas {

	public String getMatricula() {
		return super.matricula;
	}
	
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
