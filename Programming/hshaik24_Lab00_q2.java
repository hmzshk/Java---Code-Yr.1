package hshaik24;
//imports scanner class from library 
import java.util.Scanner;

//calls on class hshaik24_Lab00_q2 from the package
public class hshaik24_Lab00_q2 
{

	//Main Method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Initializes x1 y1 and y2 side1 side2 and distance and assigns a value to each, double allows for decimal values
		double x1 = 1 , y1 = 2 , x2 = 4 , y2 = 7 ,
				side1 = 0 , side2 = 0 , distance = 0;
				
				//assigns value to side1 by using binary operation it calls on x2 and x1 from the initialized variables x2 and x1 above
				side1 = x2 - x1 ;
				//assigns value to side1 by using binary operation it calls on x2 and x1 from the initialized variables x2 and x1 above
				side2 = y2 - y1 ;
				
				/*initializes distance and also assigns value to distance using Math class, the Sqrt function takes a square root 
				 * and pow takes a power
				 */
				distance = Math . sqrt ( side1 * side1 + Math . pow ( side2 , 2.0));
				//this next set of lines tells the system to print out the result whilst also converting the doubles into strings
				System . out . println (" The distance between points (" +
				Double.toString(x1)  + "," + Double . toString ( y1 ) +
				") and (" + Double . toString ( x2 ) + "," +
				Double . toString ( y2 ) + ") is " +
				Double . toString ( distance ));
	}

}
