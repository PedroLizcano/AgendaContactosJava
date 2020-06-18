package agenda;

/*extends porque es una subclase de Contactos*/
public class Amigos extends Contactos {
	/*declaro los atributos*
	 * private para que solo lo pueda utilziar esta clase*/
private int Afinidad;
/*creo los getter y setter*/
public int getAfinidad() {
	return Afinidad;
}

public void setAfinidad(int afinidad) {
	Afinidad = afinidad;
}
/*creo los constructores con los atributos de la clase padre y la hija*/
public Amigos(String nombre, String apellido, String correo, String telefono,int afinidad) {
	super(nombre, apellido, correo, telefono);
	Afinidad = afinidad;
}

public Amigos(String nombre, String apellido, String correo, String telefono) {
	super(nombre, apellido, correo, telefono);
}

public Amigos() {
	super();
}

/*creo el metodo ToString utilizando el metodo ToString de la clase padre*/
public String mostrardatos() {
	String Amigos=(super.mostrardatos()+"\nAfinidad: "+this.Afinidad);
	return Amigos;
}

}

