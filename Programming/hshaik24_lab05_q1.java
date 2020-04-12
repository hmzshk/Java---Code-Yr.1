package hshaik24_Lab005;
import java.util.Scanner;
public class hshaik24_lab05_q1
{
	public static void printHeader ( int labNum , int questionNum, String fName , String lName , String mission )
	{
		int Size = fName.length();
		if((fName.length()+lName.length()+7)>mission.length())
		{
			Size = (fName.length()+lName.length()+1);
		}
		else
			Size = mission.length();
		
		for(int i=0;i<Size;i++)
		{
			System.out.print("* ");
		}
		System.out.println("\n" + mission);
		for(int i=0;i<Size;i++)
		{
			System.out.print("* ");
		}
		System.out.print("\nLab " + labNum);
		System.out.print("\nQuestion " + questionNum);
		System.out.print("\nName: " + fName + " " + lName);
		System.out.println("");
		for(int i=0;i<Size;i++)
		{
			System.out.print("* ");
		}
		
	}
	public static int getPositiveInteger(int numIn)
	{
		Scanner input = new Scanner(System.in);
		while(numIn<=0)
		{
			System.out.println("Invalid Entry! Please enter a positive integer: ");
			numIn = input.nextInt();
		}
		return numIn;
	}
	public static double computeFactorial (int value )
	{
		int factorial=1;
		int num3=value;
		for(int i=1;i<=value;i++)
		{
			factorial = factorial * i;
		}
		return factorial;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Lab num: ");
		int labNum = input.nextInt();
		System.out.print("Question Num: ");
		int questionNum =input.nextInt();
		System.out.print("First Name: ");
		String fName = input.nextLine();
		fName = input.nextLine();
		System.out.print("\nLast Name: ");
		String lName = input.nextLine();
		System.out.print("Mission: ");
		String mission = input.nextLine();
		printHeader(labNum,questionNum,fName,lName,mission);
		
		
		
		System.out.println("Input an integer number to calculate its factorial:");
		int num1 = input.nextInt();
		int num2 = num1;
		getPositiveInteger(num1);
		double factorial = computeFactorial(num1);
		System.out.println("Factorial of "+ num2 + " is " + factorial);
	}

}
