package aggrigation;

public class Address 
{
	String address;
	Student stu;
	
	public Address(String address, Student stu) {
		super();
		this.address = address;
		this.stu = stu;
	}
	public void display()
	{
		System.out.println(stu.rollno+" "+stu.name+" "+ address);
		
	}
	public static void main(String args[])
	{
	Student s= new Student(52,"Subi");
	
	
	Address add= new Address("niravil", s);
	add.display();
	}
	

}
