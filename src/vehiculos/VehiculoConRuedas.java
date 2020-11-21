package vehiculos;

import java.sql.Date;

public abstract class VehiculoConRuedas extends Vehiculo{
		
		private String matricula;
		private int cantRuedas;
		private Date fechaMatriculacion;
	
		public abstract Date proximaItv();
		
		public int getNumeroDeRuedas() {
			return cantRuedas;
		}
		
		public String getMatricula() {
			return matricula;
		}
		
		public Date getFechaMatriculacion() {
			return fechaMatriculacion;
		}
		
		@Override
		public String toString() {	//No se utiliza el toString de vehiculo por incluir dos veces el modelo, y la variable MODELO_NO_DISPONIBLE no es accesible por esta clase.
			return (super.getModelo() == null ? "N/A" : super.getModelo())
					+ " (" + super.getColor() + ")" 
					+ " Matricula: " + matricula;
		}
		
		public VehiculoConRuedas() {
			this((String) null, (String) null, 0, (String) null, (Date) null);
			}
		
		public VehiculoConRuedas(String modelo, String color) {
			this(modelo, color, 0, (String) null, (Date) null);
		}
		
		public VehiculoConRuedas(String modelo, String color, int cantRuedas) {
			this(modelo, color, cantRuedas, (String) null, (Date) null );
		}
		
		public VehiculoConRuedas(String modelo, String color, int cantRuedas, String matricula, Date fechaMatriculacion) {
			super(modelo, color);
			this.cantRuedas = cantRuedas;
			this.matricula = matricula;
			this.fechaMatriculacion = fechaMatriculacion;
		}
}
