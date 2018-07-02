package demoSpringIoc;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationContext {
	public static void main(String[] args) {
		org.springframework.context.ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee em = (Employee) context.getBean("employee");
		em.print();
	}

}
