package week3.day1;

public class Automation extends MultipleLanguage{
	public  String ruby(String str)
	{
		
		return str;
		
	}
	public void java()
	{

		System.out.println("Interface Language");
		
	}
	public void selenium()
	{

		System.out.println("Interface TesttTool");

	}

	public static void main(String[] args)
	{
		
		Automation auto=new Automation();
		System.out.println(auto.ruby("Ruby unimplemented Language"));
		System.out.println("--------------------------------------");
		auto.python();
		System.out.println("--------------------------------------");

		auto.java();
		System.out.println("--------------------------------------");

		auto.selenium();
		
	}

	

}
