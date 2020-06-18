package agenda;

public class Contactos {
	/*declaro las variables de la clase padre
	 * protected para que solo los puedan usar sus herencias*/
protected String nombre,apellido,correo,telefono;
/*creo los getter y setters*/
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

/*creo los constructores*/
public Contactos() {
	super();
}

public Contactos(String nombre) {
	super();
	this.nombre = nombre;
}

public Contactos(String nombre, String apellido) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
}

public Contactos(String nombre, String apellido, String correo) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
}

public Contactos(String nombre, String apellido, String correo, String telefono) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
	this.telefono = telefono;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}
/*creo el metodo ToString*/
public String mostrardatos() {
	String contactos = ("Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\ncorreo: " + this.correo +"\nTelefono: " + this.telefono);
	return contactos;
}
}


