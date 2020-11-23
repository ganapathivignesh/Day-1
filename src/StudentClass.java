
public class StudentClass {
	String name;
	int rollno;
	StudentClass()
	{
		
	}
	
	public StudentClass(String name, int rollno) 
	{
		
		this.name = name;
		this.rollno = rollno;
	}
	
}
class Record extends StudentClass
{
	String name;
	int rollno;
	String address;
	public Record(String name, int rollno, String address) {
		super(name,rollno);
		
		this.address = address;
	}
	public void display()
	{
		System.out.println(name+" "+rollno+" "+address);
	}
}
