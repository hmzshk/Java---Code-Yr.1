package hshaik24_lab007;

public class Employee 
{
	String m_firstName;
	String m_lastName;
	int m_ID;
	int m_salary;
	
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
