package demoSpringIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainOPA {
  public static void main(String[] args) throws Exception {
    ApplicationContext context = new ClassPathXmlApplicationContext("AspectJAOP.xml");
    HelloOPA hello = (HelloOPA) context.getBean("helloopa");
    hello.method1();
    System.out.println("\n");
    hello.method2();
  }
}