package visitor.figure;

public class VisitorCount extends Visitor{
	private int countCircle;
	private int countSquare;
	private int countTriangle;
	
	public VisitorCount(){
		this.countCircle = 0;
		this.countSquare = 0;
		this.countTriangle = 0;
	}

	@Override
	public void visitCircle(Circle circle) {
		countCircle += 1;
	}

	@Override
	public void visitSquare(Square square) {
		countSquare += 1;
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		countTriangle += 1;
	}
	
	public int getCountCircle(){
		return countCircle;
	};
	
	public int getCountSquare(){
		return countSquare;
	};
	
	public int getCountTriangle(){
		return countTriangle;
	};

}
