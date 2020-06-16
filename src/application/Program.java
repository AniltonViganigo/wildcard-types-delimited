package application;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new entities.Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		System.out.println("Área total: " + String.format("%.2f", totalArea(myShapes)));
	}

	public static double totalArea(List<Shape> list) {
		double soma = 0.0;
		for (Shape s : list) {
			soma += s.area();
		}
		return soma;
	}

}
