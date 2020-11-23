
public class Human 
{
	String name;
	String gender;
	Human()
	{
		
	}
    public Human(String name, String gender) 
    {
	this.name = name;
	this.gender = gender;
    }
    public void find (Woman w,Man m)
    {
    	if(m.age>w.age)
    		System.out.println(m.name+"is elder");
    	else
    		System.out.println(w.name+"is elder");
    
    }
}
class Woman extends Human
{
	int age;
	
	public Woman(String name, String gender,int age)
	{
		super(name, gender);
		this.age=age;
	}

}
class Man extends Human
{
	int age;
	public Man(String name, String gender,int age) 
	{
		super(name, gender);
		this.age=age;
	}

	
	
}