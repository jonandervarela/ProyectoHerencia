package principal;

import clases.Coche;
import clases.Moto;
import clases.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Voy a crear un Vehiculo
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setDatos();
		
		System.out.println("El vehiculo introducido es " + vehiculo);
		
		//Voy a crear un coche
		//Coche coche = new Coche();
		vehiculo = new Coche();
		vehiculo.setDatos();
		
		System.out.println("El coche introducido es " + vehiculo);
		
		System.out.println("Introduce moto");
		vehiculo = new Moto();
		vehiculo.setDatos();
		
		System.out.println("La moto introducida es " + vehiculo);

	}

}
