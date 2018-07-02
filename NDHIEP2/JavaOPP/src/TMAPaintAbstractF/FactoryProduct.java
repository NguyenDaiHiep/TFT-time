package TMAPaintAbstractF;

public class FactoryProduct {
	public static AbstractCircle getCircle(AbstractFactory abs){
			return abs.createAbstractCircle();
		
	}
	public static AbstracyRectangle getRec(AbstractFactory abs){
		return abs.createAbstractRectangle();
	}

}
