package TMAPaintAbstractF;

public class Concreat2D implements AbstractFactory{
	private int x;
	private int y;
	private int radius;
	private int with;
	private int length;
	

	

	public Concreat2D(int x, int y, int radius, int with, int length) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.with = with;
		this.length = length;
	}

	@Override
	public AbstractCircle createAbstractCircle() {
		return new Circle2D(radius, x, y);
	}

	@Override
	public AbstracyRectangle createAbstractRectangle() {
		
		return new Rectangle2D(x, y, with, length);
	}
	

}
