package Figura;

/**
 *
 * @author LorenManu
 *
 */
public class Cuadrado extends Paralelogramo {

	private int numLadosIguales;

	public Cuadrado() {
		super();
		this.numLadosIguales=4;
	}

	public Cuadrado(int id, String nombre, int numLados,int numLadosIguales) {
		super(id, nombre, numLados);
		this.numLadosIguales=numLadosIguales;
	}

	public int getNumLadosIguales() {
		return this.numLadosIguales;
	}

	public void setNumLadosIguales(int numLadosIguales) {
		this.numLadosIguales = numLadosIguales;
	}

	public void pintar() {
		System.out.println("\n");
		System.out.println("=============================================================");
		super.pintar();
		System.out.println("=============================================================");
		System.out.println("Cuadrado");
		System.out.println("=============================================================");
		System.out.println("Num Lados Iguales = "+this.numLadosIguales);
		System.out.println("=============================================================");
		System.out.println("\n");
	}

}
