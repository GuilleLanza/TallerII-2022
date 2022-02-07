
public class Clientes {
	
	//Atributos
	String nombre;
	String apellido;
	long cedula;
	long telefono;
	
	//Constructores
	public Clientes (long cedula) {
		this.cedula = cedula;
		this.nombre = "";
		this.apellido = "";
		this.telefono = telefono;
	}
	public Clientes(String nombre, String apellido, long telefono) {
		this.cedula = 1234;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;	
	}
	public Clientes(String nombre, String apellido, long telefono, long cedula) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;	
	}
	//Métodos
	public long getCedula() {
		return cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public long getTelefono() {
		return telefono;
	}

}
