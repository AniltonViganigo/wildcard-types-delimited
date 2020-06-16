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
		
		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(3.0));
		myCircle.add(new Circle(4.0));

		System.out.println("Área total: " + String.format("%.2f", totalArea(myCircle)));
	}

	public static double totalArea(List<? extends Shape> list) {
		double soma = 0.0;
		for (Shape s : list) {
			soma += s.area();
		}
		return soma;
	}

}
