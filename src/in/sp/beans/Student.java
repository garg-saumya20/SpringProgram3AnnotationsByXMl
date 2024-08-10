package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{

	@Value("Saumya")
	private String name;
	@Value("101")
	private String rollno;
	@Value("94.23f")
	private float marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(marks);
		
	}
}
