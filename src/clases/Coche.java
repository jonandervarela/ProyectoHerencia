package clases;

public class Coche extends Vehiculo{
	
	private Integer numPuertas;

	
	public Integer getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(Integer numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	//setDatos
	public void setDatos() {
		super.setDatos();
		System.out.println("Introduce numPuertas: ");
		numPuertas = teclado.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [numPuertas=" + numPuertas + "]";
	}
	
	
	
	

}
