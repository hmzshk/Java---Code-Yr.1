package hshaik24_Lab003;
import java.util.Scanner;

public class hshaik24_lab03_q3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("------------------------------\r\n" + 
				"Student Name\r\n" + 
				"Lab #3\r\n" + 
		 		"Date:\r\n" + 
				"Question #2\r\n" + 
				"------------------------------");
		int Size, Integer=0,numInputs;
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many Integers Would you Like to Enter");
		Size = userInput.nextInt();
		numInputs = Size;
		while(Size<=0)
		{
			System.out.println("Invalid Input,Please Enter an Integer greater/less than Zero.");
			Size = userInput.nextInt();
		}
		int num =0,max=0,min=0,evenC=0,oddC=0,sum=0,x=2;
		double mean=0;
		System.out.println("Enter Integer 1");
		num=userInput.nextInt();
		mean=num;
		max=num;
		min=num;
		boolean even = true;
		boolean odd = true;
		if(num%2==0)
		{
			even = true;
			evenC++;
		}
		if(!(num%2==0))
		{
			odd = true;
			oddC++;
		}
		System.out.print("Mean is: " + mean/numInputs + "\nMax Value is: " + max + "\nMin Value is: " + min + "\n# of Even Numbers is: " + evenC + "\n# of odd Numbers is: " + oddC);
		
		for(;Size>1;Size--)
		{
			
			System.out.println("\r\n"
					+ "\r\nEnter Integer " + x);
			num=userInput.nextInt();
			mean = mean + num;
			min=Math.min(num,min);
			max=Math.max(num,max);
			if(num%2==0)
			{
				even = true;
				evenC++;
			}
			if(!(num%2==0))
			{
				odd = true;
				oddC++;
			}
			System.out.print("Mean is: " + mean/numInputs + "\nMax Value is: " + max + "\nMin Value is: " + min + "\n# of Even Numbers is: " + evenC + "\n# of odd Numbers is: " + oddC);
			x++;
		}	
		
	}

}
