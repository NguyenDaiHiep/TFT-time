package TMAPaintAbstractF;

public class Concreate3D implements AbstractFactory{
	private int x;
	private int y;
	private int z;
	private int radius;
	private int with;
	private int length;
	private int height;
	
	

	public Concreate3D(int x, int y, int z, int radius, int with, int length, int height) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.radius = radius;
		this.with = with;
		this.length = length;
		this.height = height;
	}

	@Override
	public AbstractCircle createAbstractCircle() {
		return new Circle3D(radius, x, y, z);
	}

	@Override
	public AbstracyRectangle createAbstractRectangle() {
		// TODO Auto-generated method stub
		return new Rectangle3D(x, y, z, with, length, height);
	}
	

}
