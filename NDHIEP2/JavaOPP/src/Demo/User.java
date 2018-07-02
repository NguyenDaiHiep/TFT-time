package Demo;

public class User {
	public void view() {
		Factory factory = new Factory();
		factory.viewCarF("HONDA");

	}
	public static void main(String[] args) {
		User us1 = new User();
		us1.view();
	}
}
