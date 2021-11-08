import java.util.Scanner;

public class studentStatus
	{

		static Scanner stringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
	
		static String firstName;
		static String lastName;
		static String firstPeriod;
		static String FPGrade;
		static String secondPeriod;
		static String SPGrade;
		static String thirdPeriod;
		static String TPGrade;

		public static void studentAction()
			{
				System.out.println("would you like to do?");
				System.out.println("(1) - add a student");
				System.out.println("(2) - delete a student");
				System.out.println("(3) - return to the main menu");
				int userChoice = intInput.nextInt();
				if (userChoice == 1)
					{
						addStudents();
					}

				else if (userChoice == 2)
					{
						deleteStudents();
					}
				else
					{
						runSIS.displayMenu();
					}
			}

		public static void addStudents()
			{
				int inputNum;
				String inputString;
			
				System.out.println("What is the student's first name?");
				firstName = stringInput.nextLine();
				
				System.out.println("Last name?");
				lastName = stringInput.nextLine();
				
				System.out.println("What is the student's first period?\n1) Algebra\n2) Biology\n3) English");
						inputNum = intInput.nextInt();
						switch(inputNum)
						{
							case 1:
								{
									firstPeriod = "Algebra";
									break;
								}
							case 2:
								{
									firstPeriod = "Biology";
									break;
								}
							case 3:
								{
									firstPeriod = "English";
									break;
								}
							default:
								{
									System.out.println("That is not a valid class...");
									studentAction();
								}
						}
				
				System.out.println("First period grade?");
				inputString = stringInput.nextLine();
				switch(inputString)
				{
					case "A+":
					case "A":
					case "A-":
					case "B+":
					case "B":
					case "B-":
					case "C+":
					case "C":
					case "C-":
					case "D+":
					case "D":
					case "D-":
					case "F":
						{
							FPGrade = inputString;
							break;
						}
					default:
						{
							System.out.println("That is not a valid grade... try again");
							studentAction();
						}
				}
				
				System.out.println("What is the student's second period?\n1) Algebra\n2) Biology\n3) English");
						inputNum = intInput.nextInt();
						switch(inputNum)
						{
							case 1:
								{
									secondPeriod = "Algebra";
									break;
								}
							case 2:
								{
									secondPeriod = "Biology";
									break;
								}
							case 3:
								{
									secondPeriod = "English";
									break;
								}
							default:
								{
									System.out.println("That is not a valid class... try again");
									studentAction();
								}
						}
				
				System.out.println("Second period grade?");
				inputString = stringInput.nextLine();
				switch(inputString)
				{
					case "A+":
					case "A":
					case "A-":
					case "B+":
					case "B":
					case "B-":
					case "C+":
					case "C":
					case "C-":
					case "D+":
					case "D":
					case "D-":
					case "F":
						{
							SPGrade = inputString;
							break;
						}
					default:
						{
							System.out.println("That is not a valid grade... try again");
							studentAction();
						}
				}
				
				System.out.println("What is the student's third period?\n1) Algebra\n2) Biology\n3) English");
				inputNum = intInput.nextInt();
				switch(inputNum)
				{
					case 1:
						{
							thirdPeriod = "Algebra";
							break;
						}
					case 2:
						{
							thirdPeriod = "Biology";
							break;
						}
					case 3:
						{
							thirdPeriod = "English";
							break;
						}
					default:
						{
							System.out.println("That is not a valid class... try again");
							studentAction();
						}
				}
				
				System.out.println("Third period grade?");
				inputString = stringInput.nextLine();
				switch(inputString)
				{
					case "A+":
					case "A":
					case "A-":
					case "B+":
					case "B":
					case "B-":
					case "C+":
					case "C":
					case "C-":
					case "D+":
					case "D":
					case "D-":
					case "F":
						{
							TPGrade = inputString;
							break;
						}
					default:
						{
							System.out.println("That is not a valid grade... try again");
							studentAction();
						}
				}
				
				GPACalcV2.GPACounter();
				runSIS.listOfStudents.add(new Student(firstName, lastName, firstPeriod, FPGrade, secondPeriod, SPGrade, thirdPeriod, TPGrade));
				runSIS.displayMenu();
			}

		public static void deleteStudents()
			{
				int menuCounter = 1;
				for(Student s : runSIS.listOfStudents)
					{
						System.out.print(menuCounter + ") ");
						System.out.println(s.getFirstname() + s.getLastname() + s.getFirstperiod() +
											s.getFirstgrade() + s.getSecondperiod() + s.getSecondgrade() +
											s.getThirdperiod() + s.getThirdgrade());
						menuCounter++;
					}
				
				System.out.println("Which student would you like to delete?");
				String deleteInput = stringInput.next() + 1;
				
				runSIS.listOfStudents.remove(deleteInput);
				
				runSIS.displayMenu();
			}

	}
