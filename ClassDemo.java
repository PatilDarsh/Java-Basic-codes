import java.util.Scanner;
class  ClassDemo
{
	Scanner sc = new Scanner(System.in);
	int rollno;
	String name;
	double fees;
	void input()
	{
		System.out.println("Enter the Roll NO:");
		rollno= sc.nextInt();
		System.out.println("Enter the Name:");
		name= sc.next();
		System.out.println("Enter the Fees:");
		fees= sc.nextDouble();
	}
	void output()
	{
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Fees:"+fees);
	}
	public static void main(String args[])
	{
		ClassDemo SD= new ClassDemo();
		SD.input();
		SD.output();
	}


}
