package hshaik24_lab007;
import java.util.Scanner;
public class hshaik24_lab07_q2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//asks user to poulate the two arrays
		System.out.print("Welcome! Please populate the first 3x3 matrix: ");
		double[][] array = new double[3][3];
		double[][] array2 = new double [3][3];
		double[][] arrayCopy1 = new double[3][3];
		double[][] arrayCopy2 = new double[3][3];
		double[][] arrayResult = new double[3][3];
		
		populateMatrix(array);
		arrayCopy1 = array;
		System.out.print("\n");	
		printMatrix(array);
	
		System.out.print("Please populate the Second 3x3 matrix");
		
		populateMatrix(array2);
		arrayCopy2 = array2;
		System.out.print("\n");	
		printMatrix(array2);
		
		//prints Header
		String header = "Please choose an option: ";
		int numStars = header.length();
		for(int i=0; i<=(numStars+6); i++)
			System.out.print("*");
		System.out.print("\n** ");
		System.out.print(header);
		System.out.println("**");
		for(int i=0; i<=(numStars+6); i++)
			System.out.print("*");
		
		//Gives options to user as to what matrix operations they want to perform
		System.out.println("\na. add");
		System.out.println("b. subtract");
		System.out.println("c. Multiply");
		System.out.println("d. exit");
	
		while(true)
		{
			//scans option selected by user
			System.out.print("\nOption: ");
			Scanner input = new Scanner(System.in);
			char choice = input.next().charAt(0);
			
			//if loops for options
			if(choice == 'a')
			{
				addMatrices(arrayCopy1,arrayCopy2,arrayResult);
				printMatrix(arrayResult);
			}
			else if(choice == 'b')
			{
				subtractMatrices(arrayCopy1,arrayCopy2,arrayResult);
				printMatrix(arrayResult);
			}
			else if(choice == 'c')
			{
				multiplyMatrices(arrayCopy1,arrayCopy2,arrayResult);
				printMatrix(arrayResult);
			}
			else if(choice == 'd')
			{
				System.out.print("\nGoodbye!");
				break;
			}
		}
	}

	public static void populateMatrix ( double [][] a)
	{
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a.length;j++)
			{
				System.out.print("\nEnter a real number for element ("+(i+1)+","+(j+1)+"): ");
				Scanner input = new Scanner(System.in);
				a[i][j] = input.nextInt();
			}
		}	
	}
	public static void printMatrix ( double [][] a)
	{
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a.length;j++)
			{
				System.out.print(a[i][j]+ "        ");
			}
			System.out.println("\n");
		}
	}
	public static void addMatrices ( double [][] a, double [][] b, double [][] result )
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				result[i][j]=a[i][j] + b[i][j];
			}
		}
	}
	public static void subtractMatrices ( double [][] a, double [][] b, double [][] result )
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				result[i][j]=a[i][j] - b[i][j];
			}
		}
	}
	public static void multiplyMatrices ( double [][] a, double [][] b, double [][] result )
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0; k<a.length;k++)
				{
					result[i][j]+=a[i][k] * b[k][j];
				}
			}
		}
	}
}
