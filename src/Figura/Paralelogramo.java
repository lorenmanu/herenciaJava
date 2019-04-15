package Figura;

/**
 *
 * @author LorenManu
 *
 */
public class Paralelogramo extends FiguraGeometrica {

	private int numGrados;

	public Paralelogramo() {
		super();
		this.numGrados=360;
	}

	public Paralelogramo(int id, String nombre, int numLados) {
		super(id, nombre, numLados);
		this.numGrados=360;
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
		System.out.println("Paralelogramo");
		System.out.println("=============================================================");
		System.out.println("numGrados = "+numGrados);
		System.out.println("=============================================================");
		System.out.println("\n");
	}


}
