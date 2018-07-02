package TMAPaintAbstractF;

public abstract class AbstracyRectangle extends AbstractShape{
	protected int x;
	protected int y;
	protected int with;
	protected int length;
	public AbstracyRectangle(int x, int y, int with, int length) {
		this.x = x;
		this.y = y;
		this.with = with;
		this.length = length;
	}

}
