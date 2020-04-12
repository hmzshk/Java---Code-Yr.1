package hshaik24_Lab005;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class hshaik24_lab05_q3 
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
			System.out.println("Welcome to the math practice program!");
			System.out.println();
			int choice = 0;
			Random rand = new Random();
				
			System.out.print("Please choose a difficulty level \n" + "1) Easy: Integers ranging 0 to 10 \n" + "2) Medium: Integers ranging 0 to 100 \n" + "3) Hard: Integers ranging -100 to 100 \n" + "Please input a choice (1-3):");
			System.out.println();
			int difficulty = input.nextInt();
			while (!((difficulty >=1) && (difficulty <= 3))) 
			{
				System.out.println("Invalid difficulty choice! \n" + "Please input a choice (1-3):");
				System.out.println();
				difficulty = input.nextInt();
			}
			while(choice != 6) 
			{	
				System.out.println("Please select the type(s) of problems: \n" + "1. Addition \n" + "2. Subtraction \n" + "3. Multiplication \n" + "4. Random \n" + "5. Change Difficulty \n" + "6. Exit \n" + "Please input a choice (1-6):");
				choice = input.nextInt();
				
				while (!((choice >=1) && (choice <= 6))) 
				{
					System.out.println("Invalid question type! \n" + "Please input a choice (1-6):");
					choice = input.nextInt();
				}
				fetchDifficulty(choice, difficulty);
				
			}
		}	
		public static void fetchDifficulty(int choice, int difficulty) 
		{
			Scanner input = new Scanner(System.in);
			if(choice == 1) 
			{		
					if (difficulty == 1)
						difficulty1(choice,difficulty);
					else if (difficulty == 2)
						difficulty2(choice,difficulty);
					else if (difficulty == 3)
						difficulty3(choice,difficulty);	
			}
			else if (choice ==2) 
			{	
					if (difficulty == 1)
						difficulty1(choice,difficulty);
					else if (difficulty == 2)
						difficulty2(choice,difficulty);
					else if (difficulty == 3)
						difficulty3(choice,difficulty);	
			}
			else if(choice ==3) 
			{		
					if (difficulty == 1)
						difficulty1(choice,difficulty);
					else if (difficulty == 2)
						difficulty2(choice,difficulty);
					else if (difficulty == 3)
						difficulty3(choice,difficulty);	
			}
			else if(choice == 4) 
			{		
					if (difficulty == 1)
						difficulty1(choice,difficulty);
					else if (difficulty == 2)
						difficulty2(choice,difficulty);
					else if (difficulty == 3)
						difficulty3(choice,difficulty);			
			}
			else if(choice ==5) 
			{
					System.out.println("What difficulty would you like to change to? \n" + "1) Easy: Integers ranging 0 to 10 \n" + "2) Medium: Integers ranging 0 to 100 \n" + "3) Hard: Integers ranging -100 to 100 \n" + "Please input a choice (1-3):");
					int newDifficulty = input.nextInt();
					while (!((newDifficulty >=1) && (newDifficulty <= 3))) 
					{
						System.out.println("Invalid difficulty! \n" + "Please input a choice (1-3):");
						newDifficulty = input.nextInt();
					}
					System.out.println("Please select the type(s) of problems: \n" + "1. Addition \n" + "2. Subtraction \n" + "3. Multiplication \n" + "4. Random \n" + "5. Change Difficulty \n" + "6. Exit \n" + "Please input a choice (1-6):");
					int newChoice = input.nextInt();
					while (!((newChoice >=1) && (newChoice <= 6))) 
					{
						System.out.println("Invalid question type! \n" + "Please input a choice (1-6):");
						newChoice = input.nextInt();
					}
				fetchDifficulty(newChoice, newDifficulty);
			}
			else if(choice == 6) 
			{
					System.exit(0);
			}
				
		}
		public static void difficulty1(int choice, int difficulty) 
		{
			int answer=0, useranswer=0, correct = 0;
			long currentTime = System.currentTimeMillis();
			Scanner input = new Scanner(System.in);
					
			if (choice == 1) 
			{
				for (int i =1; i <= 10; i++)
				{
					int rand1= (int)(Math.random()*11);
					int rand2 = (int)(Math.random()*11);
					answer = rand1 + rand2;
					System.out.println("Question " + i + "\n" + "What is " + rand1 + " + " + rand2 + " equel to? Enter answer: ");
					useranswer = input.nextInt();
					if (useranswer == answer) 
					{
						System.out.println("Correct!");
						correct++;
					} 
					else if (useranswer != answer) 
					{
						System.out.println("Incorrect! The correct answer was: " + answer);
					}
				}				
			}
			else if (choice == 2) 
			{
					for (int i =1; i <= 10; i++) 
					{
						int rand1= (int)(Math.random()*11);
						int rand2 = (int)(Math.random()*11);
						answer = rand1 - rand2;
						System.out.println("Question " + i + "\n" + "What is " + rand1 + " - " + rand2 + " equel to? Enter answer: ");
						useranswer = input.nextInt();
						if (useranswer == answer) 
						{
							System.out.println("Correct!");
							correct++;
						} 
						else if (useranswer != answer) 
						{
							System.out.println("Incorrect! The correct answer was: " + answer);
						}
					}
						
				}
			else if (choice == 3)
			{
				   	for (int i =1; i <= 10; i++) 
				   	{
						int rand1= (int)(Math.random()*11);
						int rand2 = (int)(Math.random()*11);
						answer = rand1 * rand2;
						System.out.println("Question " + i + "\n" + "What is " + rand1 + " * " + rand2 + " equel to? Enter answer: ");
						useranswer = input.nextInt();
						if (useranswer == answer) 
						{
							System.out.println("Correct!");
							correct++;
						} 
						else if (useranswer != answer) 
						{
							System.out.println("Incorrect! The correct answer was: " + answer);
						}
					}
			}
					
			else if (choice == 4) 
			{
				correct = random(difficulty);
			}
					
				long endTime = System.currentTimeMillis();
				float totalTime= ((endTime - currentTime)/1000)/10;
				System.out.println();
				System.out.println("You scored " + correct + "/10 questions correctly and ");
				System.out.print(" the average question time was " + totalTime +  " seconds.");
		}
		public static void difficulty2(int choice, int difficulty) 
		{
			int answer=0, useranswer=0, correct = 0, value = choice;
			long currentTime = System.currentTimeMillis();
			Scanner input = new Scanner(System.in);
			
			
			if (choice == 1)
			{
				for (int i =1; i <= 10; i++) 
				{
					int rand1= (int)(Math.random()*101);
					int rand2 = (int)(Math.random()*101);
					answer = rand1 + rand2;
					System.out.println("Question " + i + "\n" + "What is " + rand1 + " + " + rand2 + " equel to? Enter answer: ");
					useranswer = input.nextInt();
					if (useranswer == answer) 
					{
						System.out.println("Correct!");
						correct++;
					}
					else if (useranswer != answer) 
					{
						System.out.println("Incorrect! The correct answer was: " + answer);
					}
				}
			}
			else if (choice == 2) 
			{
				for (int i =1; i <= 10; i++) 
				{
					int rand1= (int)(Math.random()*101);
					int rand2 = (int)(Math.random()*101);
					answer = rand1 - rand2;
					System.out.println("Question " + i + "\n" + "What is " + rand1 + " - " + rand2 + " equel to? Enter answer: ");
					useranswer = input.nextInt();
					if (useranswer == answer) 
					{
						System.out.println("Correct!");
						correct++;
					} 
					else if (useranswer != answer) 
					{
						System.out.println("Incorrect! The correct answer was: " + answer);
					}
				}				
			}
			else if (choice == 3) 
			{
				for (int i =1; i <= 10; i++) 
				{
					int rand1= (int)(Math.random()*101);
					int rand2 = (int)(Math.random()*101);
					answer = rand1 * rand2;
					System.out.println("Question " + i + "\n" + "What is " + rand1 + " * " + rand2 + " equel to? Enter answer: ");
					useranswer = input.nextInt();
					if (useranswer == answer) 
					{
						System.out.println("Correct!");
						correct++;
					}	 
					else if (useranswer != answer) 
					{
						System.out.println("Incorrect! The correct answer was: " + answer);
					}
				}			
			}
			else if (choice == 4) 
			{
				correct = random(difficulty);
			}
				
			long endTime = System.currentTimeMillis();
			float totalTime= ((endTime - currentTime)/1000)/10;
			System.out.println();
			System.out.println("You scored " + correct + "/10 questions correctly and ");
			System.out.print(" the average question time was " + totalTime +  " seconds.");
		}
		public static void difficulty3(int choice, int difficulty) 
		{
			int answer=0, useranswer=0, correct = 0;
			long currentTime = System.currentTimeMillis();
			Scanner input = new Scanner(System.in);
							
			if (choice == 1)
			{
				for (int i =1; i <= 10; i++) 
				{
					int rand1= ThreadLocalRandom.current().nextInt(-101, 101);
					int rand2 = ThreadLocalRandom.current().nextInt(-101, 101);
					answer = rand1 + rand2;
					System.out.println("Question " + i + "\n" + "What is " + rand1 + " + " + rand2 + " equel to? Enter answer: ");
					useranswer = input.nextInt();
					if (useranswer == answer)
					{
						System.out.println("Correct!");
						correct++;
					} 
					else if (useranswer != answer) 
					{
						System.out.println("Incorrect! The correct answer was: " + answer);
					}
				}
			}	
			else if (choice == 2) 
			{
				for (int i =1; i <= 10; i++) 
				{
					int rand1= ThreadLocalRandom.current().nextInt(-101, 101);
					int rand2 = ThreadLocalRandom.current().nextInt(-101, 101);
					answer = rand1 - rand2;
					System.out.println("Question " + i + "\n" + "What is " + rand1 + " - " + rand2 + " equel to? Enter answer: ");
					useranswer = input.nextInt();
					if (useranswer == answer)
					{
						System.out.println("Correct!");
						correct++;
					} 
					else if (useranswer != answer) 
					{
						System.out.println("Incorrect! The correct answer was: " + answer);
					}
				}
			}
			else if (choice == 3)
			{
				for (int i =1; i <= 10; i++) 
				{
					int rand1= ThreadLocalRandom.current().nextInt(-101, 101);
					int rand2 = ThreadLocalRandom.current().nextInt(-101, 101);
					answer = rand1 * rand2;
					System.out.println("Question " + i + "\n" + "What is " + rand1 + " * " + rand2 + " equel to? Enter answer: ");
					useranswer = input.nextInt();
					if (useranswer == answer)
					{
						System.out.println("Correct!");
						correct++;
					}
					else if (useranswer != answer)
					{
						System.out.println("Incorrect! The correct answer was: " + answer);
					}
				}

			}
			else if (choice == 4) 
			{
				correct = random(difficulty);
			}
				
			long endTime = System.currentTimeMillis();
			float totalTime= ((endTime - currentTime)/1000)/10;
			System.out.println();
			System.out.println("You scored " + correct + "/10 questions correctly and ");
			System.out.print(" the average question time was " + totalTime +  " seconds.");
		}
		public static int random(int difficulty) 
		{
			int answer =0, useranswer= 0, correct= 0;
			int max = 0, min = 0;
			Scanner input = new Scanner(System.in);
			
			if(difficulty == 1)
			{
				min = -1;
				max = 11;
			}
			else if(difficulty == 2)
			{
				min = -1;
				max = 101;
			}
			else if(difficulty == 3)
			{
				min = -101;
				max = 101;
			}
			
				for (int i =1; i <= 10; i++)
				{
					int rand3 = (int)(Math.random()*4);
					switch(rand3) 
					{
				
						case 1: int rand1= ThreadLocalRandom.current().nextInt(min, max);
						int rand2 = ThreadLocalRandom.current().nextInt(min, max);
						answer = rand1 + rand2;
						System.out.println("Question " + i + "\n" + "What is " + rand1 + " + " + rand2 + " equel to? Enter answer: ");
						useranswer = input.nextInt();
						if (useranswer == answer)
						{
							System.out.println("Correct!");
							correct++;
						}
						else if (useranswer != answer)
						{
							System.out.println("Incorrect! The correct answer was: " + answer);	
						}       break;
						
						case 2: 
						int rand4= ThreadLocalRandom.current().nextInt(min, max);
						int rand5 = ThreadLocalRandom.current().nextInt(min, max);
						answer = rand4 - rand5;
						System.out.println("Question " + i + "\n" + "What is " + rand4 + " - " + rand5 + " equel to? Enter answer: ");

					}
				}
				return min;		
		}
						
}
