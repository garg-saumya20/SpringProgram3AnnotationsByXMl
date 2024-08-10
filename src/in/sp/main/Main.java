package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String resource_path="/in/sp/resources/ApplicationContext.xml";	
	ApplicationContext context=new ClassPathXmlApplicationContext(resource_path);
	
	Student std=(Student) context.getBean("student");
	std.display();

	}

}
