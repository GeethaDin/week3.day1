package week3.day1;

public class Students {
	public void getInfo(int id)
	{
		System.out.println("ID = "+id);
		System.out.println("-------------------------------------");
		
	}
	public void getInfo(int id, String name)
	{
		System.out.println("ID and name is = "+id + name);
		System.out.println("-------------------------------------");	
		
	}
	public void getInfo(String email, int phoneNum)
	{
		System.out.println("Email and phone number is  = "+ email +phoneNum);
	}
	public static void main(String[] args)
	{
		Students s = new Students();
		s.getInfo(121);
		s.getInfo(121, "Geetha");
		s.getInfo("mgeethu2789@gmail.com", 8984535);
		
		
	}

}
