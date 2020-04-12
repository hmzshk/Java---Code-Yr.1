package hshaik24_lab06;
import java.util.Scanner;
import java.util.Random;
public class hshaik24_lab06_q3 
{
	public static void printHeader ( int labNum , int questionNum, String fName , String lName , String mission )
	{
		int Size = fName.length();
		if((fName.length()+lName.length()+7)>mission.length())
		{
			Size = (fName.length()+lName.length()+1);
		}
		else
			Size = mission.length();
		
		for(int i=0;i<Size;i++)
		{
			System.out.print("* ");
		}
		System.out.println("\n" + mission);
		for(int i=0;i<Size;i++)
		{
			System.out.print("* ");
		}
		System.out.print("\nLab " + labNum);
		System.out.print("\nQuestion " + questionNum);
		System.out.print("\nName: " + fName + " " + lName);
		System.out.println("");
		for(int i=0;i<Size;i++)
		{
			System.out.print("* ");
		}
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Lab num: ");
		int labNum = input.nextInt();
		System.out.print("Question Num: ");
		int questionNum =input.nextInt();
		System.out.print("First Name: ");
		String fName = input.nextLine();
		fName = input.nextLine();
		System.out.print("\nLast Name: ");
		String lName = input.nextLine();
		System.out.print("Mission: ");
		String mission = input.nextLine();
		printHeader(labNum,questionNum,fName,lName,mission);
		*/
		while(true)
		{
			String[] deckArray = new String[52];
			String[] suitArray = {"H","C","D","S"};
			populateDeck(deckArray,suitArray);
			String dc =  drawCard(deckArray);
			String dc2 = drawCard(deckArray);
			String sep = dc2.substring(1);
			int num1 = Integer.parseInt(sep);
			String sep1 = dc.substring(1);
			int num = Integer.parseInt(sep1);
		
			System.out.println("\nThe First Card Drawn is: " +showCard(dc));
			System.out.println("Do you think the next Card Drawn will be higher or Lower?press 1 for higher, press 0 for lower");
			Scanner input = new Scanner(System.in);
			int in = input.nextInt();
			if(num1 > num && in==1)
			{
				System.out.println("correct");
			}
			else if(num1 < num && in==1)
			{
				System.out.println("incorrect");
			}
			else if(num1 > num && in==0)
			{
				System.out.println("incorrect");
			}
			else if(num1 < num && in==0)
			{
				System.out.println("correct");
			}
			System.out.println(showCard(dc2));
			
			System.out.print("Do you want to play again? if you do press 1");
			int choice = input.nextInt();
			
			if(choice != 1)
			{
				break;
			}
		}
				
	
	}
	public static void populateDeck(String[] deck, String[] suits)
	{
		System.out.println();
		for(int i=0,j=1;i<=12 && j<=13;i++,j++)
		{
			deck[i] = suits[0]+j;
			System.out.print(deck[i]+" ");
		}
		System.out.println();
		for(int i=13,j=1;i<=25 && j<=13;i++,j++)
		{
			deck[i] = suits[1]+j;
			System.out.print(deck[i]+" ");
		}
		System.out.println();
		for(int i=26,j=1;i<=38 && j<=13;i++,j++)
		{
			deck[i] = suits[2]+j;
			System.out.print(deck[i]+" ");
		}
		System.out.println();
		for(int i=39,j=1;i<=51 && j<=13;i++, j++)
		{
			deck[i] = suits[3]+j;
			System.out.print(deck[i]+" ");
		}
	}
	public static String showCard(String cardValue)
	{
		String sep = cardValue.substring(1);
		char suit = cardValue.charAt(0);
		int num = Integer.parseInt(sep);
		if(num ==1)
		{
			cardValue = "A" + suit;
		}
		else if(num ==11)
		{
			cardValue = "J" + suit;
		}
		else if(num ==12)
		{
			cardValue = "Q" + suit;
		}
		else if(num ==13)
		{
			cardValue = "K" + suit;
		}
		return cardValue;
	}
	public static String drawCard ( String [] deck )
	{
		Random rand = new Random();
		int i = rand.nextInt(52);
		while(rand.nextInt(52) == i)
		{
			i = rand.nextInt(52);
		}
		String drawCard = deck[i];
		
		return drawCard;
	}
}
