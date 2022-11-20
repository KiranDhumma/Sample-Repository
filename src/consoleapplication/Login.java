package consoleapplication;

import java.util.Scanner;



public class Login {
	static String status;
	static StudentAccountInfo[] account = new StudentAccountInfo[2];
	
	public Login() {		
		account[0] = new StudentAccountInfo("S101", "John", "abcd");
		account[1] = new StudentAccountInfo("S102", "Daniel", "mnop");

	}
	public void authenticateStudent() {
		Scanner studentAuth = new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		String id  =  studentAuth.nextLine();
		System.out.println("Enter Password: ");
		String pwd = studentAuth.nextLine();
		studentAuth.close();

		
		for(StudentAccountInfo myAccount : account) {
			String savedStudentid = myAccount.getStudentId();
			String savedPassword = myAccount.getLoginPwd();
			
			if((id.equals(savedStudentid)) && 
					(pwd.equals(savedPassword))) {
				// return savedStudentid;
				status = "Successfully Logged in";
					
			}
			else {
				status = null;
				// return null;
				// status = null;
				
			}
			if(status != null) {
				// return savedStudentid;
				break;
			}
			}
	}

}
