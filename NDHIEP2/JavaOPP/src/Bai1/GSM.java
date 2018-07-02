package Bai1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import Bai1.Battery.BarrteyType;

public class GSM {
	private String model;
	private String manufacturer;
	private int price;
	private String owner;
	private Battery battery;
	private Display display;
	public static final Object IPhone4s = new GSM("ip4s", "apple", 200, "Hiep",
			new Battery("A", 10, 10, BarrteyType.LiIon), new Display(30, 100));
	private ArrayList<Call> callHistory = new ArrayList<>();

	public GSM(String model, String manufacturer, int price, String owner, Battery battery, Display display) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
		this.display = display;
		this.battery = battery;
		this.callHistory = callHistory;
	}
	public GSM() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "GSM [model=" + model + ", manufacturer=" + manufacturer + ", price=" + price + ", owner=" + owner
				+ ", battery=" + battery + ", display=" + display + ", callHistory=" + callHistory + "]";
	}


	public ArrayList<Call> addCall(Call c1){
		callHistory.add(c1);
		return callHistory;
	}
	public ArrayList<Call> deleteCall(Call c1){
		callHistory.remove(c1);
		return callHistory;
	}
	public void deleteCallHistory(){
		callHistory.clear();
	}
	public double sumPrice(){
		double sum = 0;
		for (int i = 0; i < callHistory.size(); i++) {
			sum += callHistory.get(i).sumPriceOneCall();
		}
		return sum;
		
	}
	public double deleteCallLongest(){
		double sum = 0;
		Call max = Collections.max(callHistory);
		callHistory.remove(max);
		for (int i = 0; i < callHistory.size(); i++) {
			sum += callHistory.get(i).sumPriceOneCall();
		}
		return sum;
		
	}
	

}
