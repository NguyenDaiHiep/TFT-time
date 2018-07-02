package Bai1;



import Bai1.Battery.BarrteyType;

public class GSMTest {
	public static void main(String[] args) {
		Battery bat1 = new Battery("A",10, 10, BarrteyType.LiIon);
		Battery bat2 = new Battery("B", 5, 10, BarrteyType.NiCd);
		Battery bat3 = new Battery("c", 5, 5, BarrteyType.NiMH);
		
		Display dis1 = new Display(30, 50);
		Display dis2 = new Display(50, 50);
		Display dis3 = new Display(60, 70);
		
		GSM g1 = new GSM("S9","SamSung" , 1000, "Hiep", bat1, dis3);
		GSM g2 = new GSM("ip8", "Apple", 1100, "anh A",bat2, dis2);
		GSM g3 = new GSM("F1S", "Oppo", 300, "anh B", bat3, dis1);
		System.out.println(GSM.IPhone4s);
		GSM[] array = {g1,g2,g3};
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[0]);
		
	}

}
