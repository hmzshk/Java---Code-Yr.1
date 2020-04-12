package hshaik24_Lab001;

import java.util.Scanner;

public class hshaik24_Lab01_q3 
{

	public static void main(String[] args) 
	{
		int currentYear = 0, milleniums=0,centuries=0,decades=0,years=0;// Initializes each variable and assigns value of zero
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
		System.out.println("Please enter the current Year, this program will only accept four digits");//instructs user to enter current year
		currentYear = userInput.nextInt();//sets currentYear equal to what the user entered
		
		milleniums = currentYear/1000;
		currentYear= currentYear%1000;
		centuries = currentYear/100;
		currentYear = currentYear%100;
		decades = currentYear/10;
		years = currentYear/100;
		years = currentYear%10;
		
		
		
		
		System.out.println("The Current year is composed of " + milleniums + " milleniums " + centuries + " Centuries " + decades + " decades " + " and " + years + " years");
		
		userInput.close();//prints out calculated values
	}

}
