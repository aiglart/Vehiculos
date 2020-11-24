package vehiculos;

public class Vehiculo {

	private static final String MODELO_NO_DISPONIBLE = "N/A";
	private String modelo;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	protected String getModelo() {
		return modelo == null ? MODELO_NO_DISPONIBLE : modelo + " (" + getColor() + ")";
	}

	public Vehiculo() {
	}

	public Vehiculo(String modelo, String color) {
		this.modelo = modelo;
		setColor(color);
	}

	@Override
	public String toString() {
		return modelo + " (" + getColor() + ")";
	}

}