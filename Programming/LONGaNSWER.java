package classTest;

import java.util.Scanner;

public class LONGaNSWER 
{

	public static void main(String[] args) 
	{
		int Integer = 0, firstDig=0,secondDig=0,thirdDig=0,fourthDig=0,Divisor,num;// Initializes each variable and assigns value of zero
		Scanner userInput = new Scanner(System.in);// Creates a new scanner called userInput
		System.out.print("******************************************************\r\n" + 
				"ES1036b: Lab 01 Q3\r\n" + 
				"Date:\r\n" + 
				"Name:\r\n" + 
				"Student Number:\r\n" + 
				"Program’s mission: This program will break the current\r\n" + 
				"year into subcomponents.\r\n" + 
				"******************************************************\r\n" + 
				"");//prints personal info
		System.out.println("This program will find all Palandromic Values in a certain range with a given Divisor");
		System.out.println("First enter the first Integer between 1 and 9999 inclusive.");
		num= userInput.nextInt();//sets currentYear equal to what the user entered
		while(num<1 || num>9999)
		{
			System.out.println("Invalid Input, Enter a value between 1 and 9999");
			num=userInput.nextInt();
		}
		
		System.out.println("Now Please enter the Divisor with value between 1 and 150 inclusive");
		Divisor = userInput.nextInt();
		while(Divisor<1 || Divisor>150)
		{
			System.out.println("Invalid Input, Enter a Value between 1 and 150 inclusive");
			Divisor = userInput.nextInt();
		}
		while(num>1)
		{
		Integer = num;
		
		firstDig = Integer/1000;
		Integer= Integer%1000;
		secondDig = Integer/100;
		Integer = Integer%100;
		thirdDig = Integer/10;
		Integer=Integer%10;
		fourthDig = Integer;
		
		boolean Palindrome = false;
		int Count = (int)(Math.log10(num)+1);
		
		if(Count==3)
		{
			
			if(secondDig==fourthDig)
			{
				
					Palindrome=true;
					if(Palindrome && num%Divisor==0)
					{
						System.out.println(num + " is a palindrome");
					}	
			}
			else 
			{
					Palindrome = false;
			}
			
		}
	
		else if(Count==2)
		{
			if(thirdDig==fourthDig)
			{                                                                                                                                                                                                                                                                          
				Palindrome=true;
				if(Palindrome && num%Divisor==0)
				{
					System.out.println(num + " is a palindrome");
				}
				
			}
		}
		else if(Count==4)
		{
			if(firstDig==fourthDig)
			{
				if(secondDig==thirdDig)
				{
					Palindrome=true;
					if(Palindrome && num%Divisor==0)
					{
						System.out.println(num + " is a palindrome");
					}
					
				}
				
			}
			
		}
		num--;
	}

}
}

		//prints out calculated values



