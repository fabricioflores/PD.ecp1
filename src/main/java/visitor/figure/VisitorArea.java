package visitor.figure;

public class VisitorArea extends Visitor{
	
	private double area;
	
	public VisitorArea(){
		this.area = 0;
	}

	@Override
	public void visitCircle(Circle circle) {
		area += circle.area();
	}

	@Override
	public void visitSquare(Square square) {
		area += square.area();
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		area += triangle.area();
	}
	
	public double getArea(){
		return this.area;
	}

}
