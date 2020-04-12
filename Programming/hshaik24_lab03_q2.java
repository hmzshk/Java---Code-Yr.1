package hshaik24_Lab003;
import java.util.Scanner;

public class hshaik24_lab03_q2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int firstNum = 0, Divisor = 0;
		System.out.println("This program will find all Palandromic Values in a certain range with a given Divisor");
		System.out.println("First enter the first Integer between 1 and 999 inclusive.");
		Scanner userInput = new Scanner(System.in);
		
		firstNum = userInput.nextInt();
		while(firstNum<1 || firstNum>999)
		{
			System.out.println("Invalid Input, Enter a value between 1 and 999");
			firstNum=userInput.nextInt();
		}
		
		System.out.println("Now Please enter the Divisor with value between 1 and 150 inclusive");
		Divisor = userInput.nextInt();
		
		while(Divisor<1 || Divisor>150)
		{
			System.out.println("Invalid Input, Enter a Value between 1 and 150 inclusive");
			Divisor = userInput.nextInt();
		}
		
		
		while(firstNum>0)
		{
			int lowerNum = 0;
			boolean Palindrome = true;
			String Num = Integer.toString(firstNum);
			int higherNum = Num.length()-1;
			while(lowerNum < higherNum)
			{
				if (Num.charAt(lowerNum) != Num.charAt(higherNum))
				{
					Palindrome = false;
					break;
				}
				lowerNum++;
				higherNum--;
				
			}
			if (Palindrome && firstNum%Divisor == 0)
			{

					System.out.println(firstNum + " is a palindrome");
				
			}
			firstNum--;
		}
			
	}

}
