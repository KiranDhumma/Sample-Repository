package consoleapplication;

import java.util.Scanner;

public class ConsoleApplication {
	private boolean authenticationStatus;
	private String newCourseId;
	
	
	public ConsoleApplication() {
		authenticationStatus = false;
		newCourseId = null;
	}
	
	public void run() {
		while(true) {
			while(!authenticationStatus) {
				System.out.println("Wel-Come\n");
				StudentAccountInfo authentication = new StudentAccountInfo();
				authenticationStatus = authentication.authenticateStudent();
			}
			// chooseYourOption();
			performAction();
			
			
			authenticationStatus = false;
			System.out.println("Thank You! Goodbye!");
		}
		
	}
	
	private int chooseYourOption() {
		System.out.println();
		System.out.printf("%10s", "Main Menu");
		System.out.println();
		System.out.printf("%-3d%-20s", 1, "Display all courses\n");
		System.out.printf("%-3d%-20s", 2, "View enrolled courses\n");
		System.out.printf("%-3d%-20s", 3, "Enroll in a new Course\n");
		System.out.printf("%-3d%-10s", 4, "Clock-in time\n");
		System.out.printf("%-3d%-10s", 5, "View summary\n");
		System.out.printf("%-3d%-20s", 6, "exit\n");
		System.out.println();
		
		Scanner userChoice = new Scanner(System.in);
		System.out.println("Enter your option: ");
		// userChoice.close();
		return userChoice.nextInt();

	}
	
	private void performAction() {
		boolean userExited = false;
		
		// chooseYourOption();
		
		while(!userExited) {
			int mainMenuSelection = chooseYourOption();
			System.out.println();
			switch(mainMenuSelection) {
			case 1:
				Courses allCourses = new Courses();
				allCourses.displayAllCourses();
				break;
				
			case 2:
				StudentCourseInfo.viewEnrolledCases();
				// newCourseId = Enroll.getNewCourseId();
				// StudentCourseInfo.saveStudentCourseInfo();
				break;
				
			case 3:
				Enroll myCourseName = new Enroll();
				myCourseName.newEnrollment();
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			case 6:
				System.out.println("Exiting the system");
				userExited = true;
				break;
				
			default: 
				System.out.println("You did not enter a valid selection. Try again. ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		ConsoleApplication myApp = new ConsoleApplication();
		myApp.run();
	}

}
