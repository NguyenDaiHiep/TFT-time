package Demo;

public class Factory {
	
	public void viewCarF(String cartype){
		Car car;
		if(cartype.equalsIgnoreCase("HONDA")){
			car = new HonDa();
			car.viewcar();
		}else if(cartype.equalsIgnoreCase("FERAR")){
			car = new Ferar();
			car.viewcar();
		}else if(cartype.equalsIgnoreCase("LAMBO")){
			car = new LamBo();
			car.viewcar();
		}
	}

}
