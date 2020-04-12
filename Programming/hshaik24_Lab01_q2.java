package hshaik24_Lab001;

//GRADE CALCULATOR
import java.util.Scanner;

public class hshaik24_Lab01_q2 
{
	public static void main(String[] args)
	{
		double grade1 = 0.0, grade2 = 0.0, grade3 = 0.0, grade4 = 0.0, weight1 = 0.0, weight2 = 0.0, weight3 = 0.0, weight4 = 0.0,finalGrade;
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("This program will calculate your grade based on your four project marks and the weighting of each project,"
				+ " to start please enter your Grade for your first Project");
		
		grade1 = userInput.nextDouble();
		System.out.println("Enter the weight of your first Project");
		weight1 = userInput.nextDouble();
		
		System.out.println("Enter the Grade for your Second project");
		grade2 = userInput.nextDouble();
		System.out.println("Enter the weight of your Second Project");
		weight2 = userInput.nextDouble();
		
		System.out.println("Enter the Grade for your Third project");
		grade3 = userInput.nextDouble();
		System.out.println("Enter the weight of your Third Project");
		weight3 = userInput.nextDouble();
		
		System.out.println("Enter the Grade for your Last project");
		grade4 = userInput.nextDouble();
		System.out.println("Enter the weight of your Last Project");
		weight4 = userInput.nextDouble();
		
		finalGrade = grade1*weight1 + grade2*weight2 + grade3*weight3 + grade4*weight4;
		System.out.print("Your final Grade is: " + finalGrade);
		
		userInput.close();
	}

}
	
