package Bai1;

public class Call implements Comparable<Call>{
	private String hours;
	private Date date;
	private String phoneNumber;
	private Integer duration;
	double priceOnMinute = 0.37;
	public Call(String hours, Date date, String phoneNumber, Integer duration) {
		this.hours = hours;
		this.date = date;
		this.phoneNumber = phoneNumber;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Call [hours=" + hours + ", date=" + date + ", phoneNumber=" + phoneNumber + ", duration=" + duration
				+ "]";
	}
	
	
	public String getHours() {
		return hours;
	}
	public Date getDate() {
		return date;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getDuration() {
		return duration;
	}
	public double getPriceOnMinute() {
		return priceOnMinute;
	}
	public double sumPriceOneCall(){
		return 0.37/60 * duration;
	}
	@Override
	public int compareTo(Call call) {
		return this.duration.compareTo(call.getDuration());
	}
	
	

}
