package vehiculos;

public abstract class VehiculoConRuedas extends Vehiculo {
<<<<<<< HEAD
		
		private String matricula;
		private int cantidadRuedas;
	
		public String getMatricula() {
			return matricula;
			
		}
		
		public int getNumeroDeRuedas() {
			return cantidadRuedas;
		}
		
		@Override
		public String toString() {	//No se utiliza el toString de vehiculo por incluir dos veces el modelo, y la variable MODELO_NO_DISPONIBLE no es accesible por esta clase.
			return (super.getModelo() == null ? "N/A" : super.getModelo())
					+ " (" + super.getColor() + ")" 
					+ " Matricula: " + matricula;
		}
		
		public VehiculoConRuedas() {
			this((String) null, (String) null, 0, (String) null);
			}
		
		public VehiculoConRuedas(String modelo, String color) {
			this(modelo, color, 0, (String) null);
		}
		
		public VehiculoConRuedas(String modelo, String color, int cantidadRuedas) {
			this(modelo, color, cantidadRuedas, (String) null);
		}
		
		public VehiculoConRuedas(String modelo, String color, int cantidadRuedas, String matricula) {
			super(modelo, color);
			this.cantidadRuedas = cantidadRuedas;
			this.matricula = matricula;
		}
}
=======

	public VehiculoConRuedas() {
		super();
	}

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}

	public abstract int getNumeroDeRuedas();

	@Override
	public String toString() {
		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas";
	}

}
>>>>>>> 1fa568a36c5e8661f50af259ceb7c762f5acf50c
