package prueba;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private empleado emp;
	
	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public void escribir() {
		System.out.println("nombre: "+nombre+", apellido: "+apellido);
		//emp.escribirLegajo();
	}
}
