package hshaik24_lab008;
import java.util.Scanner;

public class hshaik24_lab08_q1 
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
			System.out.println("What type of Employee would you like to Enter: \n1. Manager\n2. Warehouse\n3. other");
			int choice = input.nextInt();
			if(choice==1)
			{
				System.out.print("\nEnter the First Name of Employee"+ " " + (i+1)+ ":");
				String a = input.next();
				System.out.print("Enter the Last Name of the Employee: ");
				String b =input.next();
				System.out.print("Enter the ID of the Employee: ");
				int c =input.nextInt();
				System.out.print("Enter the Salary of the Employee: ");
				int d =input.nextInt();
				while(database[i].m_salary<0)
				{
					System.out.print("Enter a valid Salary: ");
					database[i].m_salary=input.nextInt();
				}
				System.out.print("Enter Operator Code: ");
				int e = input.nextInt();
				System.out.print("Enter Budget: ");
				double f = input.nextDouble();
				database[i]= new Manager(a,b,c,d,e,f);	
			}
			else if(choice==2)
			{
				System.out.print("\nEnter the First Name of Employee"+ " " + (i+1)+ ":");
				String a = input.next();
				System.out.print("Enter the Last Name of the Employee: ");
				String b =input.next();
				System.out.print("Enter the ID of the Employee: ");
				int c =input.nextInt();
				System.out.print("Enter the Salary of the Employee: ");
				int d =input.nextInt();
				while(database[i].m_salary<0)
				{
					System.out.print("Enter a valid Salary: ");
					database[i].m_salary=input.nextInt();
				}
				System.out.print("Enter Shipment#: ");
				int e = input.nextInt();
				database[i]= new Warehouse(a,b,c,d,e);
			}
			else if(choice==3)
			{
				System.out.print("\nEnter the First Name of Employee"+ " " + (i+1)+ ":");
				String a = input.next();
				System.out.print("Enter the Last Name of the Employee: ");
				String b =input.next();
				System.out.print("Enter the ID of the Employee: ");
				int c =input.nextInt();
				System.out.print("Enter the Salary of the Employee: ");
				int d =input.nextInt();
				while(database[i].m_salary<0)
				{
					System.out.print("Enter a valid Salary: ");
					database[i].m_salary=input.nextInt();
				}
				database[i]= new Employee(a,b,c,d);
			}
		}
	}
	public static void printReport (Employee [] database )
	{
		for(int i=0;i<database.length;i++)
		{
			System.out.print("\nEmployee " + (i+1) + ": ");
			database[i].printInfo();
		}
	}
}

class Employee
{
	private String m_firstName;
	private	String m_lastName;
	int m_ID;
	int m_salary;
	
	public String getFirstName () 
	{
		return m_firstName;
	}
	public String getLastName () 
	{
		return m_lastName;
	}

	Employee(){}
	/*{
		m_firstName="Hamza";m_lastName="Shaikh";m_ID=000;m_salary=10000000;
	}*/
	public Employee(String fName, String lName, int ID, int Salary)
	{
		m_firstName = fName;
		m_lastName = lName;
		m_ID = ID;
		m_salary = Salary;
	}
	public void printInfo()
	{
		System.out.println(m_firstName+" "+m_lastName+"\nID: " +m_ID+"\nSalary: "+m_salary);
	}
}

class Warehouse extends Employee
{
	int dShip;
	
	public Warehouse ( String fName , String lName , int ID ,int salary , int shipments )
	{
		super(fName,lName,ID,salary);
	}
	
	public void printInfo()
	{
		System.out.println(getFirstName()+" "+getLastName()+"\nID: " +m_ID+"\nSalary: "+m_salary+"\nOperator Code: " + "\nNumber of Shipments: " + dShip);
	}
}

class Manager extends Employee
{
	int m_opCode;
	double m_opBud;
	
	public Manager ( String fName , String lName , int ID ,int salary , int opCode , double budget )
	{
		super(fName,lName,ID,salary);
		//m_opCode = opCode;
		//m_opBud = budget;
	}
	
	public void printInfo()
	{
		System.out.println(getFirstName()+" "+getLastName()+"\nID: " +m_ID+"\nSalary: "+m_salary+"\nOperator Code: " + m_opCode+ "\n Budget: " +m_opBud);
	}
}