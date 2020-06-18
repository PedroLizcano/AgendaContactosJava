package agenda;

/*extends porque es una subclase de Contactos*/
public class Familiares extends Contactos {
/*declaro los atributos*
 * private para que solo lo pueda utilziar esta clase*/
private String direccion,parentesco;
/*creo los getter y setter*/

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getParentesco() {
	return parentesco;
}

public void setParentesco(String parentesco) {
	this.parentesco = parentesco;
}
/*creo los constructores con los atributos de la clase padre y la hija*/



public Familiares(String parentesco,String nombre, String apellido, String correo, String telefono) {
	super(nombre,apellido,correo,telefono);
	this.parentesco = parentesco;
}

public Familiares(String nombre, String apellido, String correo, String telefono, String direccion, String parentesco) {
	super(nombre, apellido, correo, telefono);
	this.direccion = direccion;
	this.parentesco = parentesco;
}

public Familiares(String nombre, String apellido, String correo, String telefono) {
	super(nombre,apellido,correo,telefono);
	
}

public Familiares() {
	super();
}

/*creo el metodo ToString utilizando el metodo ToString de la clase padre*/
public String mostrardatos() {
	String Familiares=(super.mostrardatos()+"\nDirección: "+this.direccion+"\nParentesco: "+this.parentesco);
	return Familiares;
}

}
