package week3.day1;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Student Name= Geetha");
	}
	public void studentID()
	{
		System.out.println("Student ID= IT412");
	}
	public void studentDept()
	{
		System.out.println("Student Department = IT");
	}
	public static void main(String args[]) {
		Student s=new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.departmentName();
		s.studentName();
		s.studentID();
		s.studentDept();
	}

}
