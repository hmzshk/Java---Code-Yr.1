package hshaik24_lab06;
import java.util.Scanner;
import java.util.Random;

public class hshaik24_lab06_q2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("How many times would you like to roll the dice: ");
		Scanner input = new Scanner(System.in);
		int numRollz = input.nextInt();
		System.out.println("\nThe dice was rolled "+numRollz+" Times");
		int dev = rollDice(numRollz);
		System.out.print("The Standard Deviation is: " + dev);
	}
	public static int rollDice(int numRolls)
	{
		int sum = 0;
		int myArray[] = new int[numRolls];
		for(int i=0; i<numRolls;i++)
		{
			myArray[i]=new Random().nextInt(6)+1;
			sum= sum + myArray[i];
		}
		for(int i=0; i<numRolls; i++)
		{
			System.out.print(myArray[i] + "  ");
		}
		int mean = sum/numRolls;
		Counter(myArray);
		System.out.println("\nThe Mean is: " + mean);
		int dev = stndDev(mean,myArray,numRolls);
		return dev;
	}
	public static void Counter(int myArray[])
	{
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
		for(int i=0; i<myArray.length; i++)
		{
			if(myArray[i]==1)
				count1++;
			else if(myArray[i]==2)
				count2++;
			else if(myArray[i]==3)
				count3++;
			else if(myArray[i]==4)
				count4++;
			else if(myArray[i]==5)
				count5++;
			else if(myArray[i]==6)
				count6++;
		}
		System.out.print("\nThe Number of 1s: " + count1 + "\nThe Number of 2s: " + count2 + "\nThe Number of 3s: " + count3
				+ "\nThe Number of 4s: " + count4 + "\nThe Number of 5s: " + count5 + "\nThe Number of 6s: " + count6);
	}
	public static int stndDev(int mean, int myArray[],int numRolls)
	{
		int devSum=0,var=0,n=0;
		for(int i=0; i<myArray.length;i++)
		{
			var = myArray[i]-mean;//variance between array value and mean
			devSum = (int)Math.pow(var,2);// Square of variance
			n = n +devSum;//Summation of the numerator
		}
		int undSqrt=(n/numRolls);//undSqrt is the thing under the square root
		int stdev = (int)Math.sqrt(undSqrt);//take the square root
		return stdev;
	}
}

