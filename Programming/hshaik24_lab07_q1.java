package hshaik24_lab007;
import java.util.Scanner;
public class hshaik24_lab07_q1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.print("How many Inputs would you like to store? ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String[] myArray = new String[num];
		String x = input.nextLine();
		for(int i=0; i<myArray.length; i++)
		{
			System.out.print("Enter a String: ");
			myArray[i] = input.nextLine();	
		}
		
		sortLength(myArray);
		System.out.println("The strings from shortest to longest are: " );
		for(int i=0;i<myArray.length;i++)
		{
			System.out.println(myArray[i] + " ");
		}	
	}

	public static void sortLength(String [] Array)
	{
		for(int i=0;i<Array.length-1;i++)
		{
			for(int j=1; j<Array.length;j++)
			{
				int first = Array[i].length();
				int second = Array[j].length();
				if(second<first)
				{
					String temp = Array[i];
					Array[i]=Array[i+1];
					Array[i+1]=temp;
				}
			}
		}
	}
}
