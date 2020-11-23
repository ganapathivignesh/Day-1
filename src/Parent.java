import java.util.Scanner;
public class Parent 
{
	int a,b;
  public void display()
  {
	  System.out.println("enter two numbers");  
  }
  public void getvalue()
  {
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextInt();
	  b=sc.nextInt();
  }
  
 
	
}
class Child extends Parent
{
	public void dispMax()
	{
		if(a>b && a!=0)
		{
			System.out.println("max value is"+a);
		} 
		else
		{
			System.out.println("max value is"+b);
		}
	}
	public void dispMin()
	{
		if(a<b)
		{
			System.out.println("min  value is"+a);
		}
		else
		{
			System.out.println("min  value is"+b);
		}	
	}
}
