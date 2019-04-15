package Figura;

/**
 *
 * @author LorenManu
 *
 */
public class Triangulo extends FiguraGeometrica {

	private int numGrados;

	public Triangulo() {
		super();
		this.numGrados=180;
	}

	public Triangulo(int id, String nombre, int numLados) {
		super(id, nombre, numLados);
		this.numGrados=180;
	}

	public int getNumGrados() {
		return this.numGrados;
	}

	public void setNumGrados(int numGrados) {
		this.numGrados = numGrados;
	}

	public void pintar() {
		System.out.println("\n");
		System.out.println("=============================================================");
		super.pintar();
		System.out.println("=============================================================");
		System.out.println("Triangulo");
		System.out.println("=============================================================");
		System.out.println("numGrados = "+numGrados);
		System.out.println("=============================================================");
		System.out.println("\n");
	}


}
