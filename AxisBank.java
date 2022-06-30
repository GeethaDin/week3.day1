package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Axis : Deposit Method");
	}

public static void main(String[] args)

{
	AxisBank ab=new AxisBank();
	ab.deposit();
	System.out.println("-------------------------------------");

	BankInfo bi=new BankInfo();
	bi.deposit();
	}
}
