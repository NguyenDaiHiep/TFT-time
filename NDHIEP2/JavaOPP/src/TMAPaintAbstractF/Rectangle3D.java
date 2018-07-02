package TMAPaintAbstractF;

public class Rectangle3D extends AbstracyRectangle{
	private int height;
	private int z;

	public Rectangle3D(int x, int y,int z, int with, int length, int height) {
		super(x, y, with, length);
		this.z = z;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hinh vuong 3D co toa do: " + x + " " + y + " " + z + " " + 
	"chieu rong= " + with + "chieu dai= " + length + " " + "chieu cao= "+ height + "\n";    
	}
	

}
