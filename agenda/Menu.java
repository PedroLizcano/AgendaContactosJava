package agenda;
import java.io.*;
import java.util.*;
public class Menu {
	static Scanner teclado=new Scanner(System.in);
	/*creo el arraylist de la agenda*/
	static ArrayList<Contactos> agenda=new ArrayList<Contactos>();//creo un arraylist de la clase padre
	static ArrayList<Amigos> amigo=new ArrayList<Amigos>();//creo un arraylist de la clase hija amigos
	static ArrayList<Familiares> familia=new ArrayList<Familiares>();//creo un arraylist de la clase hija familiares
	/*creo el metodo menu que sera llamado desde el Principal*/
	public static void menu() throws IOException {
 		int opc = 0;//creo una variable para indicar la opcion del menu
		do {//este DO hace un bucle hasta que la opcion sea menor que 0 o mayor que 8
			//do {//realiza una bucle mientras que la variable repetir sea TRUE
			try {//comienzo la excepcion
		System.out.println("\t||||||||||||||||||||||||||||||||||||||||||||||");//inserto el menu que se va a visualizar
		System.out.println("\t||--------------------MENU------------------||");//inserto el menu que se va a visualizar
		System.out.println("\t||||||||||||||||||||||||||||||||||||||||||||||");//inserto el menu que se va a visualizar
		System.out.println("\t||1. Insertar contacto.                     ||");//inserto la primera opcion del menu que se va a visualizar
		System.out.println("\t||2. Eliminar contacto.                     || ");//inserto la segunda opcion del menu que se va a visualizar		 
		System.out.println("\t||3. Mostrar contacto.                      || ");//inserto la tercera opcion del menu que se va a visualizar		 
		System.out.println("\t||4. Mostrar todos los contactos.           || ");//inserto la cuarta opcion del menu que se va a visualizar	 
		System.out.println("\t||5. Mostrar todos los contactos de un tipo.|| ");//inserto la quinta opcion del menu que se va a visualizar		 
		System.out.println("\t||6. Guardar Agenda                         || ");//inserto la sexta opcion del menu que se va a visualizar		 
		System.out.println("\t||7. Cargar agenda                          || ");//inserto la septima opcion del menu que se va a visualizar		
		System.out.println("\t||0. Salir.                                 ||");//inserto la ultima opcion del menu que se va a visualizar	
		System.out.println("\t||||||||||||||||||||||||||||||||||||||||||||||");//inserto el menu que se va a visualizar
		System.out.println("\tescribe la opcion que quieras hacer");//pide que insertes la opcion		
		opc=teclado.nextInt();//leo la opcion ingresada por teclado
				if(opc==1) {//condicion de que si la opcion es 1 hara el proceso que hay dentro del IF
					Insertar();//llamamos al proceso	
						}//cierro el IF
				if(opc==2) {//condicion de que si la opcion es 2 hara el proceso que hay dentro del IF
					eliminar();//llamamos al proceso
				}//cierro el IF
				if(opc==3) {//condicion de que si la opcion es 3 hara el proceso que hay dentro del IF
					visualizar();//llamamos al proceso
				}//cierro el IF
				if(opc==4) {//condicion de que si la opcion es 4 hara el proceso que hay dentro del IF
					visualizartodo();//llamamos al proceso
				}//cierro el IF
				if(opc==5) {//condicion de que si la opcion es 5 hara el proceso que hay dentro del IF
					visualizartipo();//llamamos al proceso
				}//cierro el IF
				if(opc==6) {//condicion de que si la opcion es 6 hara el proceso que hay dentro del IF
					guardar();//llamamos al proceso
				}//cierro el IF
				if(opc==7) {//condicion de que si la opcion es 7 hara el proceso que hay dentro del IF
					mostrarfichero();//llamamos al proceso
				}//cierro el IF
				if(opc==0) {//condicion de que si la opcion es 0 hara el proceso que hay dentro del IF
					System.out.println("adios");//leemos el syso 
				}//cierro el IF
			}catch(InputMismatchException e) {//se ejecuta cuando en vez de meter un opcion INT metemos un valor que no es INT
				teclado.nextLine();//dejo un espacio para que no se repita infinito el bucle
				System.out.println("valor no valido elija una opcion");//muestro por pantalla un mensaje de que el valor introducido no es valido
				menu();//vuelvo al menu
			}//cierro el catch 	
			//}while(repetir==true||opc>0&&opc<8);//cierro el bucle do que se hara hasta que la variable sea distinta de true
		}while(opc!=0);//cierro el bucle do hasta que se realiza mientras se cumpla lo que hay dentro del while
	}//cierro el metodo

	/*---------------------------------------------------------------------------------------------------*/
	/*creo los metodos que se llamaran desde el menu*/
	public static void Insertar() throws IOException {
		if(agenda.size()<=100) {//realizo un if que indica el limite de contactos de la agenda 
			boolean bandera =true;
		int opc;//creo una variable para ingresar la opcion
		System.out.println("\t||||||||||||||||||||||||||||||||");
		System.out.println("\t||------INSERTAR CONTACTO-----||");//creo el menu para que el usuario visualice la opciones
		System.out.println("\t||||||||||||||||||||||||||||||||");
		System.out.println("\t||1. Familiar.                ||");
		System.out.println("\t||2. Amigo.                   ||");
		System.out.println("\t||0. Volver al menú principal.||");
		System.out.println("\t||||||||||||||||||||||||||||||||");
		System.out.println("\telige una opcion");
		opc=teclado.nextInt();//meto la opcion por teclado
		if(opc==1) {//creo un if que se ejecutara si la opcion ingresada por teclado es 1
				Familiares familia1=new Familiares();//creo un objeto de la clase familia
				System.out.println("\tingresa el nombre");//el usuario visualizar lo que va a ingresar por teclado
					familia1.setNombre(teclado.next());//ingresa por teclado el nombre mediante el metodo set del objeto
				System.out.println("\tingresa el apellido");//el usuario visualizar lo que va a ingresar por teclado
					familia1.setApellido(teclado.next());//ingresa por teclado el apellido mediante el metodo set del objeto
				do{System.out.println("\tingresa el correo");//el usuario visualizar lo que va a ingresar por teclado
					familia1.setCorreo(teclado.next());//ingresa por teclado el correo mediante el metodo set del objeto
				}while(familia1.getCorreo().indexOf("@")==-1); //cierro el if 
				do{System.out.println("\tingresa el telefono");//el usuario visualizar lo que va a ingresar por teclado
				bandera=true;
					familia1.setTelefono(teclado.next());//ingresa por teclado el telefono mediante el metodo set del objeto
						for (int f=0;f<agenda.size();f++) {//creo un for que recorrera todo el arraylist de agenda
							if(familia1.getTelefono().equalsIgnoreCase(agenda.get(f).getTelefono())==true) {//hace la condicion de que si el telefono introducido es igual a algun telefono de la lista de contactos vuelves al menu de ingresar
								bandera=false;
							}
						}//cierro el if
				}while(bandera==false);
				System.out.println("\tingresa una direccion");//el usuario visualizar lo que va a ingresar por teclado
				familia1.setDireccion(teclado.next());//ingresa por teclado la direccion mediante el metodo set del objeto
				do {
				System.out.println("\tingresa el parentesco(cercano o lejano)");//el usuario visualizar lo que va a ingresar por teclado
					familia1.setParentesco(teclado.next());//ingresa por teclado el parentesco mediante el metodo set del objeto
				}while((familia1.getParentesco().equalsIgnoreCase("cercano")||familia1.getParentesco().equalsIgnoreCase("lejano"))==false);
						//for (int f=0;f<agenda.size();f++) //creo un for que recorrera todo el arraylist de agenda
							//if((familia1.getParentesco().equalsIgnoreCase("cercano")||familia1.getParentesco().equalsIgnoreCase("lejano"))==false) {//creo una condicion que si el parentesco es distinto a cercano o lejano volveremos al menu de insertar
								//System.out.println("valor no valido,vuelves a insertar parentesco");//visualiza por pantalla que el valor no es correcto
								//familia1.setParentesco(teclado.next());//vuelvo a metodo insertar
				              // }
						//cierro el if
				agenda.add(familia1);//agrego el objeto familia1 a lista de agenda
				familia.add(familia1);//agrego el objeto familia1 a lista de familia
				System.out.println("\tcontacto insertado correctamente");//visualiza que el contacto ha sido agregado correctamente
		}//cierro el if de ingresar un familiar
		if(opc==2) {//creo un if que se ejecutara si la opcion ingresada por teclado es 2
			Amigos amigo1=new Amigos();//creo un objeto de la clase amigo
			System.out.println("\tingresa el nombre");//el usuario visualizar lo que va a ingresar por teclado
				amigo1.setNombre(teclado.next());//ingresa por teclado el nombre mediante el metodo set del objeto
			System.out.println("\tingresa el apellido");//el usuario visualizar lo que va a ingresar por teclado
				amigo1.setApellido(teclado.next());//ingresa por teclado el apellido mediante el metodo set del objeto
				do{System.out.println("\tingresa el correo");//el usuario visualizar lo que va a ingresar por teclado
				amigo1.setCorreo(teclado.next());//ingresa por teclado el correo mediante el metodo set del objeto
			}while(amigo1.getCorreo().indexOf("@")==-1); //cierro el if 
			do{System.out.println("\tingresa el telefono");//el usuario visualizar lo que va a ingresar por teclado
			bandera=true;
				amigo1.setTelefono(teclado.next());//ingresa por teclado el telefono mediante el metodo set del objeto
					for (int f=0;f<agenda.size();f++) {//creo un for que recorrera todo el arraylist de agenda
						if(amigo1.getTelefono().equalsIgnoreCase(agenda.get(f).getTelefono())==true) {//hace la condicion de que si el telefono introducido es igual a algun telefono de la lista de contactos vuelves al menu de ingresar
							bandera=false;
						}
					}//cierro el if
			}while(bandera==false);
					do {System.out.println("\tingresa afinidad");//el usuario visualizar lo que va a ingresar por teclado
					amigo1.setAfinidad(teclado.nextInt());//ingresa por teclado el telefono mediante el metodo set del objeto
					}while(amigo1.getAfinidad()<1 || amigo1.getAfinidad()>5);
			agenda.add(amigo1);//agrego el objeto amigo1 a la lista de agenda
			amigo.add(amigo1);//agrego el objeto amigo1 a la lista de amigo
			System.out.println("\tcontacto insertado correctamente");//el usuario visualiza que el contacto ha sido insetrado correctamente
		}//cierro la condicion de insertar un amigo
		if(opc==0) {//creo una condicion de que si la opcion es 0 realiza lo que hay dentro del if
			menu();//vuelvo al metodo menu
		}//cierro la condicion 
		}else {//sino se cumple de que la agenda sea <=100 realizara lo que hay dentro del else
			System.out.println("\tnumero maximo de contactos");//el usuario visualiza por pantalla
			System.out.println("\tno se puede insertar mas contactos elimine uno");//el usuario visualiza por pantalla
		}//cierro el else
		}//cierro el metodo de insertar
	
	
	/*---------------------------------------------------------------------------------------------------*/

	public static void eliminar() {//creo el metodo eliminar
		String cadena;//creo una variable String que insertare por teclado
		System.out.println("\tescribe el numero de telefono del contacto que desea eliminar");//el usuario visualiza por pantalla
		cadena=teclado.next();//doy un valor por teclado a la variable
		for(int f=0;f<agenda.size();f++) { //creo un for que recorra todo el arrraylist de agenda
		if(cadena.equalsIgnoreCase(agenda.get(f).getTelefono())==true) {//creo una condicion de que si la cadena introducida por teclado es igual a algun telefono de un contacto de la lista agenda realice lo que hay dentro
			agenda.remove(agenda.get(f));
		}
		}//elimino el contacto de agenda 
		for(int f=0;f<amigo.size();f++) {
			if(cadena.equalsIgnoreCase(amigo.get(f).getTelefono())==true) {//creo una condicion dentro de la condicion de la clase padre  para que busque en la lista de amigo y realice lo que hay dentro
			amigo.remove(amigo.get(f));//elimina el contacto de  amigo
			System.out.println("\tcontacto eliminado");
			}//visualiza por pantalla
			}//cierro el if 
		for(int f=0;f<familia.size();f++) {
			if(cadena.equalsIgnoreCase(familia.get(f).getTelefono())==true) {//creo una condicion dentro de la condicion de la clase padre  para que busque en la lista de familia y realice lo que hay dentro
			familia.remove(familia.get(f));//elimina el contacto de la clase familia
			System.out.println("\tcontacto eliminado");//visualiza por pantalla
			}//cierro el if
		}
		}//cierro el if general
		//cierro el for 
		//cierro el metodo eliminar	
		
	/*-----------------------------------------------------------------------------------------------------*/
	public static void visualizar() {//creo el metodo visualizar
		String cadena;//creo una variable String
		System.out.println("\tescribe el numero de telefono del contacto que desea ver");//muestro por pantalla un mensaje
		cadena=teclado.next();//inicializo la varable por teclado
		for(int f=0;f<agenda.size();f++) {//recorro la lista agenda con un for
		if(cadena.equalsIgnoreCase(agenda.get(f).getTelefono())==true) {//creo una condicion que se cumple si la variable cadena es igual a algun telefono de la lista agenda
			System.out.println(agenda.get(f).mostrardatos());//muestro por pantalla el contacto que tenga ese telefono
		}//cierro el if
	}//cierro el for
	}//cierro el metodo visualizar
	/*------------------------------------------------------------------------------------------------------*/
	public static void visualizartodo() {//creo el metodo visualizartodo 
		ordenartelefono();//llamo al metodo ordenartelefono
	}//cierro el metodo visualizartodo
	/*-----------------------------------------------------------------------------------------------------*/
	public static void visualizartipo() throws IOException {//creo el metodo visualizar tipo
		int opc=0;//creo la variable opc y la inicializo
		System.out.println("\t||||||||||||||||||||||||||||||||");
		System.out.println("\t||-----VISUALIZAR UN TIPO-----||");//creo el menu para que el usuario visualice la opciones
		System.out.println("\t||1. Familiar.                ||");
		System.out.println("\t||2. Amigo.                   ||");
		System.out.println("\t||0. Volver al menú principal.||");
		System.out.println("\t||||||||||||||||||||||||||||||||");
		System.out.println("\telige una opcion");
		opc=teclado.nextInt();//escribo la opcion por teclado
		if(opc==1) {//la condicion de que la opcion es 1
			/*int contador=0;
			for(int f=0;f<agenda.size();f++) {
				if(agenda.get(f) instanceof Familiares) {
						System.out.println(agenda.get(f).mostrardatos());
						contador=contador+1;
					}
				}
			System.out.println("hay "+contador+" familiares");
				}*/	
			ordenarapellido();//llamo al metodo ordenarapellido
		}//cierro el if
		if(opc==2) {//condicion si la opcion es 1
			/*int contador=0;
			for(int f=0;f<agenda.size();f++) {
				if(agenda.get(f) instanceof Amigos) {
						System.out.println(agenda.get(f).mostrardatos());
						contador=contador+1;
					}
				}
			System.out.println("hay "+contador+" amigos");*/
			ordenarafinidad();//llamo al metodo ordenarafinidad
				}//cierro el if
		if(opc==0) {//se realiza si la opcion es 0
			menu();//llamo al metodo menu
		}//cierro el if
	}//cierro el metodovisualizartipo
	
	/*-----------------------------------------------------------------------------------*/
	public static void guardar() throws IOException {//creo el metodo guardar
		FileWriter archivo=null;//creo el objeto archivo de la clase FileWriter que permite crear ficheros y enviarles datos
		PrintWriter pw=null;// creo el objeto pw de la clase PrintWriter que permite escribir en el fichero creado con FileWriter
		String cadena;//creo un variable String para escribir el nombre del fichero
		System.out.println("\tescribe el nombre del fichero");
		cadena=teclado.next();
		archivo=new FileWriter("E:\\java casa\\polimorfismo2\\polimorfismo2\\agenda\\src\\"+cadena+".txt");//creo el archivo escribiendo su ruta y el nombre con la cadena que meto por teclado
		pw=new PrintWriter(archivo);//le doy a pw el valor de archivo
		for(int f=0;f<agenda.size();f++) {//recorro el la lista de agenda con un for
		pw.println(agenda.get(f).mostrardatos());//escribo en el fichero lo que hay en el arraylist de agenda
		}//cierro el for
		pw.close();//cierro el PrintWriter porque sino no funciona
	}//cierro el metodo guardar
	/*------------------------------------------------------------------------------------------*/
	public static void mostrarfichero() throws IOException {
		agenda.clear();//vacio el arraylist agenda
		amigo.clear();//vacio el arraylist amigo
		familia.clear();//vacio el arraylist familia
		String nombre = null,apellido = null,correo = null,telefono = null,direccion=null,texto;//declaro las variables en las que voy a guardar los datos
		File archivo=null;
		FileReader fr=null;//creo el objeto fr de la clase FileReader que permite leer un fichero
		BufferedReader br=null;//creo el objeto br de la clase BufferedReader que permite leer una linea del fichero
		String cadena;//creo un variable String para escribir el nombre del fichero
		System.out.println("\tescribe el nombre del fichero");
		cadena=teclado.next();
		try{archivo=new File("E:\\java casa\\polimorfismo2\\polimorfismo2\\agenda\\src\\"+cadena+".txt");
		fr=new FileReader(archivo);//le doy el valor de archivo a fr para que lo pueda leer
		br=new BufferedReader(fr);//le doy el valor de fr a br para que pueda leer el archivo linea a linea
		
		while((texto = br.readLine()) !=null) {//hago un bucle que se repita mientras las linea del fichero exista 
			
			switch (texto.substring(0, 2)) {//creo un switch que se ejecute cogiendo desde la posicion 0 y 2
			case "No"://en el caso de que las 2 primeras letras sean No se cogera lo que hay despues de las primeras 8 posiciones
				nombre=texto.substring(8);//agrego a la variable nombre el texto que hay despues de la octava posicion
				break;//cierro la condicion de que si las 2 primeras posiciones es No
			case "Ap"://en el caso de que las 2 primeras letras sean Ap se cogera lo que hay despues de las primeras 10 posiciones
				apellido=texto.substring(10);;//agrego a la variable apellido el texto que hay despues de la decima posicion
				break;
			case "co":
				correo=texto.substring(8);
				break;
			case "Te":
				telefono=texto.substring(10);		
             break;
			case "Di":
				direccion=texto.substring(11);
			break;			
			case "Af":
				Amigos amigo1= new Amigos(nombre,apellido,correo,telefono,Integer.parseInt(texto.substring(10)));//creo un objeto de la clase amigos a la que le agrego las variablez que contienen los datos del contacto y  se que es amigo si se cumple la condicion del switch
				agenda.add(amigo1);//agrego el objeto amigo1
				amigo.add(amigo1);//agrego el objeto amigo1
			break;
			case "Pa":
				Familiares familia1= new Familiares(nombre,apellido,correo,telefono,direccion,texto.substring(12));//creo un objeto de la clase afamiliares a la que le agrego las variablez que contienen los datos del contacto y  se que es familiar si se cumple la condicion del switch
				agenda.add(familia1);//agrego el objeto familia1
				familia.add(familia1);//agrego el objeto familia1
			break;	
			}//cierro el switch
		}
		br.close();
		}catch(Exception e) {
			System.out.println("no existe el fichero vuelves a insertar el nombre");
			mostrarfichero();
		}
		
		
}//cierro el metodo mostrarfichero
	/*----------------------------------------------------------------------------------------------------*/
	public static void ordenarapellido () {//creo el metodo ordenarapellido
		int contador=0;//creo una variable que va a contar cuantos contactos hay
	Comparator <Familiares> comparar = (o1,o2) -> (o1.getApellido().compareTo(o2.getApellido()));//creo un proceso llamado comparar y creo 2 variables que seran contactos de la lista y los comparara por apellido
	familia.sort(Collections.reverseOrder(comparar));//ordeno el arraylist con el metodo sort al reves por collections.reverseOrder utilizando el metodo comparar creado antes
	for(int f=0;f<familia.size();f++) {//creo un for que va a recorrer el arraylist de familia
		System.out.println(familia.get(f).mostrardatos());//muestro el arraylist por el metodo mostrardatos 
		contador=contador+1;//sumo 1 cada vez que muestre un contacto
		System.out.println("-------------------------------------------------------");
	}//cierro el for
	System.out.println("\thay "+contador+" familiares");//muestro por pantalla los contactos que hay
	}//cierro el proceso ordenarapellido
	/*------------------------------------------------------------------------------------------------------*/
	public static void ordenarafinidad() {//creo el metodo oredenarafinidad
		int contador=0;//creo una variable que va a contar cuantos contactos hay
		Comparator <Amigos> comparar = (o1,o2) -> (int)o1.getAfinidad()-o2.getAfinidad();//creo un proceso llamado comparar y creo 2 variables que seran contactos de la lista y los comparara por afinidad
		amigo.sort(comparar);//ordena el arraylist amigo en orden por el metodo sort utilizando el metodo creado antes comparar
		for(int f=0;f<amigo.size();f++) {//creo un for que va a recorrer el arraylist de amigo
			System.out.println(amigo.get(f).mostrardatos());//muestro el arraylist por el metodo mostrardatos 
			contador=contador+1;//sumo 1 cada vez que muestre un contacto
			System.out.println("-------------------------------------------------------");
	}//cierro el for
		System.out.println("\thay "+contador+" amigos");//muestro por pantalla los contactos que hay
}//cierro el proceso ordenaafinidad
	/*------------------------------------------------------------------------------------------------------*/
	public static void ordenartelefono() {//creo el metodo ordenartelefono
		int contador=0;//creo una variable que va a contar cuantos contactos hay
		Comparator <Contactos> comparar = (o1,o2) -> (o1.getTelefono().compareTo(o2.getTelefono()));//creo un proceso llamado comparar y creo 2 variables que seran contactos de la lista y los comparara por telefono
		agenda.sort(comparar);//ordena el arraylist amigo en orden por el metodo sort utilizando el metodo creado antes comparar
		for(int f=0;f<agenda.size();f++) {//creo un for que va a recorrer el arraylist de agenda
			System.out.println(agenda.get(f).mostrardatos());//muestro el arraylist por el metodo mostrardatos 
			contador=contador+1;//sumo 1 cada vez que muestre un contacto
			System.out.println("-------------------------------------------------------");
		}//cierro el for
		System.out.println("\thay "+contador+" contactos");//muestro por pantalla los contactos que hay
	}//cierro el metodo
	/*------------------------------------------------------------------------------------------------------*/
}//fin del programa
		
		
		
			
			
		

				
	

	
	
	
	

