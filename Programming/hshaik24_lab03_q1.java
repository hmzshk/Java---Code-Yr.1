package hshaik24_Lab003;
import java.util.Scanner;


public class hshaik24_lab03_q1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double num1 =0,num2=0,num3=0,num4,max=0;
		
		System.out.println("Please Enter 4 integer values between -1000 and 1000 inclusive");
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter first integer");
		num1 = userInput.nextDouble();
		while(-1000>num1 || num1>1000 || (num1%17==0) || (num1%23==0))
		{
			System.out.println("Invalid Input, Please enter a valid Integer.");
			num1 = userInput.nextDouble();
		}
		
		System.out.println("enter second integer");
		num2 = userInput.nextDouble();
		while(-1000>num2 || num2>1000 || (num2%17==0) || (num2%23==0))
		{
			System.out.println("Invalid Input, Please enter a valid Integer.");
			num2 = userInput.nextDouble();
		}
		
		System.out.println("enter third integer");
		num3 = userInput.nextDouble();
		while(-1000>num3 || num3>1000 || (num3%17==0) || (num3%23==0))
		{
			System.out.println("Invalid Input, Please enter a valid Integer.");
			num3 = userInput.nextDouble();
		}
		 
		System.out.println("enter fourth integer");
		num4 = userInput.nextDouble();
		while(-1000>num4 || num4>1000 || (num4%17==0) || (num4%23==0))
		{
			System.out.println("Invalid Input, Please enter a valid Integer.");
			num4 = userInput.nextDouble();
		}
		
		if(num1>num2 && num1>num3 && num1>num4)
		{
			max=num1;
			System.out.println("The max is: " + max);
		}
		else if(num2>num1 && num2>num3 && num2>num4)
		{
			max=num2;
			System.out.println("The Max is: " + max);
		}
		else if(num3>num1 && num3>num2 && num3>num4)
		{
			max=num3;
			System.out.println("The Max is: " + max);
		}
		else if(num4>num1 && num4>num2 && num4>num3)
		{
			max=num4;
			System.out.println("The Max is: " + max);
		}
		userInput.close();
	}
	
}


