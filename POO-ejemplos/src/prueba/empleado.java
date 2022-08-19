package prueba;

public class empleado extends Persona{
	private String legajo;

	public empleado(String nombre, String apellido, String dni, String legajo) {
		super(nombre, apellido, dni);
		this.legajo = legajo;
		// TODO Auto-generated constructor stub
	}

	public void escribirLegajo() {
		System.out.println("legajo: "+legajo);
		super.escribir();
	}
	
}
