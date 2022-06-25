package project;

class Department
{
	void show()
	{
		System.out.println("this is super class");
	}
}

public class Project extends Department

{
	void show()
	{
		System.out.println("thisis sub class");
		super.show();
		
	}
	public static void main(String[] args)
	{
		
		Project p=new Project();
		p.show();
		
		
	
	}
}




