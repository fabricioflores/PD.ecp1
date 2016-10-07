package visitor.figure;

import java.util.ArrayList;
import java.util.List;

import upm.jbb.IO;

public class MainVisitorFigure {

	public static void main(String[] args) {
		VisitorArea visitorArea = new VisitorArea();
		VisitorNumberOfSides visitorNumber = new VisitorNumberOfSides();
		
		Circle circle = new Circle("Círculo", 2);
		Square square = new Square("Cuadrado", 2);
		Triangle triangle = new Triangle("Triangulo", 3, 4);
		
		List<Figure> figures = new ArrayList<>();
		figures.add(circle);
		figures.add(square);
		figures.add(triangle);
		
		for(Figure figure : figures){
			figure.accept(visitorArea);
			figure.accept(visitorNumber);
		}
		
		FiguresManager figuresManager = new FiguresManager();
		figuresManager.add(circle);
		figuresManager.add(square);
		figuresManager.add(triangle);
		
		IO.getIO().println("Area from manager" + figuresManager.totalArea());
		IO.getIO().println("Area from visitor" + visitorArea.getArea());
		
		IO.getIO().println("numero from manager" + figuresManager.totalNumberOfSides());
		IO.getIO().println("numero from visitor" + visitorNumber.getNumberSides());
	}

}
