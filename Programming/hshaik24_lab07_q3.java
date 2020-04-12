package hshaik24_lab007;
import java.util.Scanner;
public class hshaik24_lab07_q3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Employees you would like in the Database: ");
		int numEmpl = input.nextInt();
		
		//initializes Employee array and creates desired amount of indices
		Employee [] epl = new Employee[numEmpl];
		for(int i=0; i<epl.length;i++)
		{
			epl[i] = new Employee();
		}
			
		//
		enterData(epl);
		printReport(epl);
	}
	
	public static void enterData(Employee[] database)
	{
		Scanner input = new Scanner(System.in);
		for(int i=0;i<database.length;i++)
		{
			System.out.print("\nEnter the First Name of the Employee"+ " " + (i+1)+ ":");
			String a = input.next();
			System.out.print("Enter the Last Name of the Employee: ");
			database[i].m_lastName=input.next();
			System.out.print("Enter the ID of the Employee: ");
			database[i].m_ID=input.nextInt();
			System.out.print("Enter the Salary of the Employee: ");
			database[i].m_salary=input.nextInt();
			while(database[i].m_salary<0)
			{
				System.out.print("Enter a valid Salary: ");
				database[i].m_salary=input.nextInt();
			}
			}
	}
	public static void printReport ( Employee [] database )
	{
		for(int i=0;i<database.length;i++)
		{
			System.out.print("\nEmployee " + (i+1) + ": ");
			database[i].printInfo();
		}
	}
}
