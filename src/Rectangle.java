
public class Rectangle 
{
	
	double length;
	double width;
	public Rectangle(double length, double width) 
	{
		
		this.length = length;
		this.width = width;
	}
	public void area(double l,double w,double d)
	{
		  double a=l*w*d;
		System.out.println("area is"+a);
	}
	
}
class Box extends Rectangle
 {
	double depth;
	public Box(double length, double width,double depth)
	{
		super(length,width);
		this.depth=depth;
	}
	public void display()
	{
		area(length,width,depth);
	}
	
 }