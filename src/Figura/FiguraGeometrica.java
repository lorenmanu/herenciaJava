package Figura;

/**
 *
 * @author LorenManu
 *
 */
public class FiguraGeometrica {

	protected int id;

	protected String Nombre;

	protected int numLados;


	public FiguraGeometrica() {
	}

	public FiguraGeometrica(int id, String nombre, int numLados) {
		this.id = id;
		this.Nombre = nombre;
		this.numLados = numLados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public int getNumLados() {
		return this.numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	public void pintar() {
		System.out.println("\n");
		System.out.println("=============================================================");
		System.out.println("ID = "+this.id);
		System.out.println("Nombre = "+this.Nombre);
		System.out.println("Num Lados = "+this.numLados);
		System.out.println("=============================================================");
		System.out.println("\n");
	}
}
