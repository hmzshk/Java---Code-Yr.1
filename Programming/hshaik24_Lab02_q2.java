package hshaik24_Lab002;
import java.util.Scanner;

public class hshaik24_Lab02_q2 
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Initializes Variables that will be used
		double  userIncome = 0.0,Tax = 0.0;
		int maritialStatus = 0;
		
		System.out.println("What is your maritial status from the Choices given below:");
		System.out.println("1. Single");
		System.out.println("2. Married filing jointly or Qualifying Widower");
		System.out.println("3. Married filing Seperately");
		System.out.println("4. Head of Household");
		
		//Creates Scanner
		Scanner Input = new Scanner(System.in);
		maritialStatus = Input.nextInt();
		System.out.println("Enter your Income");
		userIncome = Input.nextInt();
		
		//If statements that determine tax amount based on Maritial status and income
		if(maritialStatus == 1 && (userIncome>=0 && userIncome<=8350))
		{
				Tax = userIncome*0.10;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 1 && (userIncome>=8351 && userIncome<=33950))
		{
				Tax = userIncome*0.15;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 1 && (userIncome>=33951 && userIncome<=82250))
		{
				Tax = userIncome*0.25;
				System.out.println("Your income tax is: " + Tax + " Dollars" );
		}
		else if(maritialStatus == 1 && (userIncome>=82251 && userIncome<=171550))
		{
				Tax = userIncome*0.28;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 1 && (userIncome>=171551 && userIncome<=372950))
		{
				Tax = userIncome*0.33;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 1 && (userIncome>= 372951))
		{
				Tax = userIncome*0.35;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		
		//for married filing jointly or qualifying widower
		
		else if(maritialStatus == 2 && (userIncome>=0 && userIncome<=8350))
		{
				Tax = userIncome*0.10;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 2 && (userIncome>=8351 && userIncome<=33950))
		{
				Tax = userIncome*0.15;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 2 && (userIncome>=33951 && userIncome<=82250))
		{
				Tax = userIncome*0.25;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 2 && (userIncome>=82251 && userIncome<=171550))
		{
				Tax = userIncome*0.28;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 2 && (userIncome>=171551 && userIncome<=372950))
		{
				Tax = userIncome*0.33;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 2 && (userIncome>= 372951))
		{
				Tax = userIncome*0.35;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		
		//for married filing Separately
		
		else if(maritialStatus == 3 && (userIncome>=0 && userIncome<=8350))
		{
				Tax = userIncome*0.10;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 3 && (userIncome>=8351 && userIncome<=33950))
		{
				Tax = userIncome*0.15;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 3 && (userIncome>=33951 && userIncome<=82250))
		{
				Tax = userIncome*0.25;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 3 && (userIncome>=82251 && userIncome<=171550))
		{
				Tax = userIncome*0.28;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 3 && (userIncome>=171551 && userIncome<=372950))
		{
				Tax = userIncome*0.33;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 3 && (userIncome>= 372951))
		{
				Tax = userIncome*0.35;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		
		//Head of Household
		
		else if(maritialStatus == 4 && (userIncome>=0 && userIncome<=8350))
		{
				Tax = userIncome*0.10;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 4 && (userIncome>=8351 && userIncome<=33950))
		{
				Tax = userIncome*0.15;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 4 && (userIncome>=33951 && userIncome<=82250))
		{
				Tax = userIncome*0.25;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 3 && (userIncome>=82251 && userIncome<=171550))
		{
				Tax = userIncome*0.28;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 4 && (userIncome>=171551 && userIncome<=372950))
		{
				Tax = userIncome*0.33;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		else if(maritialStatus == 4 && (userIncome>= 372951))
		{
				Tax = userIncome*0.35;
				System.out.println("Your income tax is: " + Tax + " Dollars");
		}
		
	}

}
