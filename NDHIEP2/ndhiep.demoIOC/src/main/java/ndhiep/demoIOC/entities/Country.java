package ndhiep.demoIOC.entities;

public class Country {
	private String xa;
	private String huyen;
	private String tinh;
	public Country(String xa, String huyen, String tinh) {
		this.xa = xa;
		this.huyen = huyen;
		this.tinh=tinh;
	}
	
	public Country() {
		super();
	}

	public String getXa() {
		return xa;
	}
	public String getHuyen() {
		return huyen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setXa(String xa) {
		this.xa = xa;
	}
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}

	@Override
	public String toString() {
		return "Country [xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]\t";
	}

	

}
