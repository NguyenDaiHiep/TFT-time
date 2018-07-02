package TMAPaintAbstractF;

public class Circle3D extends AbstractCircle{
	private int z;
	public Circle3D(int radius, int x, int y, int z) {
		super(radius, x, y);
		this.z = z;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hinh tron 3D co toa do: " + x +" "+  y + " " + z + " ban kinh= " + radius + "\n";
	}
	

	
	

}
