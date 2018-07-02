package ndhiep.demoIOC.entities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		Student st1 = (Student) context.getBean("student");
		st1.print();
		People st2 = (Student)context.getBean("student2");
		st2.print();
		
	}

}
