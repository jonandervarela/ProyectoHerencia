package clases;

import java.util.Scanner;

public class Vehiculo {
	
	Scanner teclado = new Scanner(System.in);

	//Atributos
	protected String matricula;
	protected int caballos;

	
	// Setters y Getters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	

	@Override
	public String toString() {
		return "Vehiculo [teclado=" + teclado + ", matricula=" + matricula + ", caballos=" + caballos + "]";
	}

	public void setDatos() {
		System.out.println("Introduce matricula:");
		matricula = teclado.next();
		System.out.println("Introduce caballos:");
		caballos = teclado.nextInt();
		

	}

}
