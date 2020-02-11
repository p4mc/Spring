public class Student
{
private String name;

public Student(){
	System.out.println("Inside default constructor");
}

Student(String name){
	this.name=name;
	System.out.println("Inside parameterized constructor");
}
public String getName(){
	System.out.println("Inside getName method");
	return this.name;
}
public void setName(String name){
	this.name=name;
	System.out.println("Inside setName method");
}
public void sayHello() 
{
	System.out.println("Hello, "+this.name);
}

}


