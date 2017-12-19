import java.util.Scanner;

public class forLoops2project


	{

		public static void main(String[] args)
			{
				//showChallenge1();
				//showChallenge2();
				showChallenge3();
				//showChallenge4();

			}

		private static void showChallenge1()
			{
			  int counter = 0;  
				for(int i = 5; i<105; i = i + 5)
					{
						System.out.println(i);
						counter = counter + i;
						
					}
				System.out.println("The sum of all the numbers is " + counter);
			}

		private static void showChallenge2()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Choose a small number");
				int lowNumber = userInput.nextInt();
				System.out.println("Ok, now choose a big number and i will print all of the numbers in the middle.");
				int highNumber = userInput.nextInt();
				
				int counter = 0;
				for(int i = 0; i < 1; i = i)
					{
						
						if(lowNumber < highNumber)
							{
								System.out.println(lowNumber);
								counter += lowNumber;
								lowNumber ++;
							}
						else
							{
								i = 2;
							}
					
					}
				
				System.out.println("Here is the sum of the number in between.");
				int sum = counter;
				System.out.println(sum);
			}

		private static void showChallenge3()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Choose a small number");
				int lowNumber = userInput.nextInt();
				System.out.println("Ok, now choose a big number and i will print all of the numbers in the middle that are divisible by 3.");
				int highNumber = userInput.nextInt();
				
				int sum = 0;
				for(int i = lowNumber; i <= highNumber; i++)
					{
						
					if(i % 3 ==0)
						{
							System.out.println(i);
							sum += i;
						}
					
					}
				
				System.out.println("Here is the sum of the number in between.");
				
				System.out.println(sum);
			}

		private static void showChallenge4()
			{
			System.out.println("*********");
			
			for(int i = 1; i < 9; i++)
				{
					System.out.println("*       *");
				}
			
			System.out.println("*********");
			
			}
			
		
	}
