package hshaik24_Lab005;
import java.util.Scanner;
public class hshaik24_lab05_q2 
{
	public static double computePower(double base, int power)
	{
		double result =1;double b=base;
		if(power==0)
		{
			result =1;
		}
		else if(power>0)
		{
			for(int i =1; i<=power; i++)
			{
				b= base*b;
			}
			result = b/base;
		}
		else if(power<0) 
		{
			power = power*-1;
			for(int i =1; i<=power; i++)
			{
				b=b*base;
			}
			result = 1/(b/base);
		}
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter an Integr Base: ");
		double b = input.nextDouble();
		System.out.print("Enter an Integer which will be the Power: ");
		int p = input.nextInt();
		
		double finalResult =computePower(b,p);
		System.out.println(finalResult);
		
	}

}
