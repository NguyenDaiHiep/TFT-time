package TMAPaintAbstractF;

public class Rectangle2D extends AbstracyRectangle{

	public Rectangle2D(int x, int y, int with, int length) {
		super(x, y, with, length);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hinh vuong 2D co toa do: " + x + 
				" " + y + " " + "chieu rong= "+ with + " "+ "chieu dai= " + length + "\n";
	}
	

}
