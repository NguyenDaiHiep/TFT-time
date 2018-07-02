package TMAPaintAbstractF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;



public class Test {
	static Stack<AbstractShape> shape = new Stack<>();
	static Stack<AbstractShape> contain = new Stack<>();

	public static void main(String[] args) {
		AbstractCircle c1 = FactoryProduct.getCircle(new Concreat2D(1, 1, 5, 5, 5));
		AbstractCircle c2 = FactoryProduct.getCircle(new Concreate3D(1, 1, 1, 10, 10, 10, 10));
		AbstractCircle c3 = FactoryProduct.getCircle(new Concreat2D(1, 2, 7, 7, 7));
		AbstracyRectangle r1 = FactoryProduct.getRec(new Concreat2D(2, 2, 6, 6, 6));
		AbstracyRectangle r2 = FactoryProduct.getRec(new Concreate3D(1, 2, 1, 9, 9, 9, 9));
		AbstracyRectangle r3 = FactoryProduct.getRec(new Concreate3D(2, 5, 1, 10, 10, 20, 10));
		System.out.println(c1);

		shape.add(c1);
		shape.add(c2);
		shape.add(c3);
		shape.add(r1);
		shape.add(r2);
		shape.add(r3);
		System.out.println("Trc khi redo  \n" + shape);
		redo();
		System.out.println("sau khi re do  \n " + shape);
		redo();
		System.out.println("sau khi re do lan  2  \n " + shape);
		undo();
		System.out.println("sau khi undo lan 1 \n" + shape);
		undo();
		System.out.println("sau khi undo lan 2 \n" + shape);

		


	}

	public static void redo() {

		contain.push(shape.pop());

	}
	public static void undo(){
		shape.push(contain.pop());
	}

}
