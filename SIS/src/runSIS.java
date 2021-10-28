import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class runSIS
	{
		public static void main(String[] args) throws IOException
			{
				Scanner file = new Scanner(new File("StudentList.txt"));
				String tempString = file.nextLine();
				String[] filler = tempString.split(" ");
			}
		public static void displayMenu()
			{
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("would you like to do?");
				System.out.println("(1) - add or delete a student");
				System.out.println("(2) - change student grades/schedule");
				System.out.println("(3) - sort students");
				int userChoice = userIntInput.nextInt();
				if(userChoice == 1)
					{
						
					}
				else if(userChoice == 2)
					{
						
					}
				else if(userChoice == 3)
					{
						
					}
				else
					{
						System.out.println("You must pick either 1, 2 or 3");
						displayMenu();
					}
			}
	
	}
