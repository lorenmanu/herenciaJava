package Main;

import java.util.ArrayList;

import Figura.FiguraGeometrica;
import Figura.Paralelogramo;
import Figura.Triangulo;
import Figura.Cuadrado;
import Figura.Rombo;

/**
 *
 * @author LorenManu
 *
 */
public class Main {
	public static ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

	public static void main(String[] args) {

		figuras.add(new FiguraGeometrica(1, "Segmento", 1));
		figuras.add(new Paralelogramo(2, "Paralelogramo", 2));
		figuras.add(new Triangulo(3, "Triangulo Uno", 3));
		figuras.add(new Cuadrado(4, "Cuadrado Uno", 4,4));
		figuras.add(new Triangulo(3, "Triangulo Dos", 3));
		figuras.add(new Cuadrado(4, "Cuadrado Dos", 4,4));
		figuras.add(new Rombo(5, "Rombo Uno", 4,2));

		// Llamamos al metodo Paint
		System.out.println("========================================");
		System.out.println("\n");
		System.out.println("Llamamos al metodo Paint de los Paralelogramos:");
		System.out.println("\n");
		System.out.println("========================================");
		int i=1;
		for (FiguraGeometrica auxFig : figuras) {
			if( auxFig instanceof Paralelogramo) {
				System.out.println("========================================");
				System.out.println("\n");
				System.out.println("Figura Paralelogramo  "+i);
				System.out.println("\n");
				System.out.println("========================================");
				auxFig.pintar();
				++i;
 			}
		}

	// Llamamos al metodo Paint
	System.out.println("========================================");
	System.out.println("\n");
	System.out.println("Llamamos al metodo Paint de los Triangulos:");
	System.out.println("\n");
	System.out.println("========================================");
	i=1;
	for (FiguraGeometrica auxFig : figuras) {
		if( auxFig instanceof Triangulo) {
			System.out.println("========================================");
			System.out.println("\n");
			System.out.println("Figura Triangulo  "+i);
			System.out.println("\n");
			System.out.println("========================================");
			auxFig.pintar();
			++i;
		}
	}
}
}
