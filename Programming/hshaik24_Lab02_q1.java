package hshaik24_Lab002;
import java.util.Scanner;

public class hshaik24_Lab02_q1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Initializes Variables
		int userInput = 0, divisor = 0, divisor2 = 0;
		Scanner Input = new Scanner(System.in);
		
		//Prompts user to enter values and assigns them to variables which were declared above
		System.out.println("Enter an Integer which will be analyzed");
		userInput = Input.nextInt();
		System.out.println("Enter an integer which will be your first divisor");
		divisor = Input.nextInt();
		System.out.println("Enter another integer which will be the second divisor");
		divisor2 = Input.nextInt();
		
		//Uses modulo operator to determine if the a number is evenly divisible by another number
		if(userInput%divisor == 0 && userInput%divisor == 0)
		{
			System.out.println(userInput + " is evenly divisbile by both");
		}
		else if(userInput%divisor == 0 || userInput%divisor2 == 0)
		{
			System.out.println(userInput + " is only evenly divisible by one of them ");
		}
		else
		{
			System.out.println(userInput + " is not evenly divisible by either");
		}
		
	}

}
