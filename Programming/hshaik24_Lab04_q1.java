package hshaik24_Lab004;
import java.util.Scanner;
public class hshaik24_Lab04_q1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int Integer = 0,num,factorial=1;
		System.out.print("Enter an Integer, and i will Compute the factorial: ");
		Scanner input = new Scanner(System.in);
		Integer = input.nextInt();
		num=Integer;
		
		while(Integer < 0)
		{
			System.out.println("Invalid Entry, Enter again");
			Integer = input.nextInt();
		}
		
		for(int i=1;i<=Integer;i++)
		{
			factorial = factorial * i;

		}
		System.out.println("Factorial of "+ num + " is " + factorial);


	}

}
