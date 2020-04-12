package hshaik24_Lab002;
import java.util.Scanner;

public class hshaik24_lab02_q3 
{
	public static void main (String[] args)
	{
		double firstNum,secondNum,result;
		int userInput=0;
		System.out.println("******************************************************");
				System.out.println("ES1036b: Lab 02 Q3");
				System.out.println("Date:");
				System.out.println("Name:"); 
				System.out.println("Student Number:");
				System.out.println("Program’s mission: Simple switch-statement calculator");
				System.out.println("******************************************************");
				
		
		System.out.println("Please enter the first Number");
		Scanner input = new Scanner(System.in);
		firstNum = input.nextDouble();
		System.out.println("Please enter the second Number");
		secondNum = input.nextDouble();
		
		System.out.println("Please enter an operation you want the program to do");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulo");
		System.out.println("6. 5-Year Loan");
		
		userInput = input.nextInt();
		
		switch(userInput)
		{
			case 1:
			result = firstNum + secondNum;
			System.out.println(firstNum + " + " + secondNum + " = " + result);
			break;
		
			case 2:
			result = firstNum - secondNum;
			System.out.println(firstNum + " - " + secondNum + " = " + result);
			break;
		
			case 3:
			result = firstNum * secondNum;
			System.out.println(firstNum + " X " + secondNum + " = " + result);
			break;
			
			case 4:
			result = firstNum / secondNum;
			System.out.println(firstNum + " / " + secondNum + " = " + result);
			break;
			
			case 5:
			result = firstNum % secondNum;
			System.out.println(firstNum + " % " + secondNum + " = " + result);
			break;
			
			case 6:
			result = (firstNum * secondNum)/(1-(1/(Math.pow(1+secondNum,(5*12)))));
			System.out.printf("Monthly Payment is equal to ",result + " with a principle payment of " + firstNum + " and an interst rate of "+ secondNum);
			break;
			
			default:
			System.out.println("ERROR! INVALID OPERATION");
			break;
		}
		
	}

}
