package visitor.figure;

public class VisitorNumberOfSides extends Visitor {
	
	private double numberSides;
	
	public VisitorNumberOfSides(){
		numberSides = 0;
	}

	@Override
	public void visitCircle(Circle circle) {
		numberSides += circle.numberOfSides();
	}

	@Override
	public void visitSquare(Square square) {
		numberSides += square.numberOfSides();
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		numberSides += triangle.numberOfSides();
	}
	
	public double getNumberSides(){
		return numberSides;
	}

}
