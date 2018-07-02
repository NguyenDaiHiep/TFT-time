package Bai1;



public class Battery {
	private String model;
	private int hoursIdel;
	private int hoursTalk;
	private BarrteyType barrteyType;
	
	public Battery(String model, int hoursIdel, int hoursTalk, BarrteyType barrteyType) {
		this.model = model;
		this.hoursIdel = hoursIdel;
		this.hoursTalk = hoursTalk;
		this.barrteyType = barrteyType;
	}
	public enum BarrteyType{
		LiIon, NiMH, NiCd
	}
	@Override
	public String toString() {
		return "Battery [model=" + model + ", hoursIdel=" + hoursIdel + ", hoursTalk=" + hoursTalk + ", barrteyType="
				+ barrteyType + "]";
	}
	


	

}
