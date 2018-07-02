package demoSpringIoc;

public class Employee {
	private String id;
	private String name;
	private String pass;
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
	public void print(){
		System.out.println("id :" + id + " name: " + name + "pass : " +pass);
	}

}
