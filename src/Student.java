
public class Student {
     int rollno;
     String name;
     int marks;
     double percentage;
     public void display()
     {
    	System.out.println(name+"="+rollno+"-"+marks+"-"); 
     }
}
class Myrecord extends Student
{
	double percentage;
	public double percentagecalc()
	{
	percentage=(marks*100)/100;
	return percentage;
	}
	public void display()
	{
		System.out.println(name+"="+rollno+"-"+marks+"-"+percentagecalc()+"-"); 
	}
	
}