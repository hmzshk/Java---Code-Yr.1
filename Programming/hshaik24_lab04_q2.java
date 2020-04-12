package hshaik24_Lab004;
import java.util.Scanner;
public class hshaik24_lab04_q2 
{
	public static void parrallelogram (int size, int numP) 
	{
		int j=0;
		for (int i= 1; i<=size; i++) 
		{
			for(int f =0; f < numP; f++) 
			{
				if (f== 0)
				{
					for(j= size; j > i; j-- ) 
					{
						System.out.print(" ");
					}

				}
				else 
				{
					System.out.print("    ");
				}

				for(int k= 1; k <= size; k++) 
				{
					if(k == 1 || j == 1) 
					{
						System.out.print(" #");
					} 
					else if (k == size || j==size ) 
					{
						System.out.print(" #");
					}
					else if(!(k == 1)) 
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int Size=0;
		int numSides;

		Scanner input= new Scanner(System.in);
		System.out.print("Enter the size of the parallelogram: ");
		Size = input.nextInt();
		System.out.print("How many Paralellograms do you want?: ");
		int numPar = input.nextInt();

		while (numPar != 0) 
		{
			parrallelogram(Size,numPar);
			System.out.println("How many more Paralellograms do you want?: ");
			numPar = input.nextInt();
		}
	}
}



