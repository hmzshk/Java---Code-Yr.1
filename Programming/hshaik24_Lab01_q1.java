package hshaik24_Lab001;

//VOLUME OF A CONE

import java.util.Scanner;//Scanner must be Capitalized

public class hshaik24_Lab01_q1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double radius = 0.0, height = 0.0, volume = 0.0;//intializes variables and assigns each value 0.0
		final double pi = 3.14;
		
		Scanner userInput = new Scanner(System. in);// creates new scanner
		
		System.out.println("This program will calculate the volume of the cone with a given radius and height, to start please input a radius");
		radius = userInput.nextDouble();
		
		System.out.println("Next Please enter a value for Height");
		height = userInput.nextDouble();
		
		volume = ((pi*Math.pow(radius, 2)*height)/3.0);
		
		System.out.print("The Volume of the cone with Radius " + radius + " and Height " + height + " is " + volume);
		
		userInput.close();
	}

}
