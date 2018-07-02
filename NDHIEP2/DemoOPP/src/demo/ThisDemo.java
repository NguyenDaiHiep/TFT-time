package demo;

public class ThisDemo {
    int id;
    String name;
 
    ThisDemo() {
        System.out.println("call Constructor mặc định");
    }
 
    ThisDemo(int id, String name) {
       //this(); // nó được sử dụng để gọi Constructor của lớp hiện tại
        this.id = id;
        this.name = name;
    }
 
    void display() {
        System.out.println(id + " " + name);
    }
 
    public static void main(String args[]) {
    	ThisDemo e1 = new ThisDemo(111, "Viet");
    	ThisDemo e2 = new ThisDemo(222, "Nam");
        e1.display();
        e2.display();
    }
}

