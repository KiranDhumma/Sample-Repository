package consoleapplication;

import java.util.Scanner;

public class StudentAccountInfo {
	private String studentId;
	private String name;
	private String loginPwd;
	static String id;
	static String pwd;
	static String status;
	static boolean authenticationStatus;
	static Scanner studentAuth;
	static StudentAccountInfo[] account = new StudentAccountInfo[2];
	
	public String getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		StudentAccountInfo.id = id;
	}
	public static void setPwd(String pwd) {
		StudentAccountInfo.pwd = pwd;
	}
	public static String getPwd() {
		return pwd;
	}
	
	public StudentAccountInfo[] getAccount() {
		return account;
	}
	public StudentAccountInfo(String studentId, String name, String loginPwd) {
		this.studentId = studentId;
		this.name = name;
		this.loginPwd = loginPwd;
	}
	public StudentAccountInfo() {
		
		account[0] = new StudentAccountInfo("S101", "John", "abcd");
		account[1] = new StudentAccountInfo("S102", "Daniel", "mnop");

		
	}
	
	public boolean authenticateStudent() {
		studentAuth = new Scanner(System.in);
			System.out.println("Enter Student ID: ");
			id  =  studentAuth.nextLine();
			setId(id);
			System.out.println("Enter Password: ");
			pwd = studentAuth.nextLine();
			setPwd(pwd);
		return authenticationStatus = userAuthentication();
	}

	public static boolean userAuthentication() {
		
		for(StudentAccountInfo myAccount : account) {
			String savedStudentid = myAccount.getStudentId();
			String savedPassword = myAccount.getLoginPwd();
			
			if((id.equals(savedStudentid)) && 
					(pwd.equals(savedPassword))) {
				status = "Successfully Logged in";
					
			}
			else {
				status = null;
				
			}
			if(status != null) {
				break;
			}
			}
		if(status != null) {
			System.out.println("Successfully Logged in");
			System.out.println();
			return true;
		}
		else {
			System.out.println("Invalid username or password. Please try again");
			System.out.println();
		return false;
	}
	}

	public static void main(String[] args) {
		authenticationStatus = false;
		StudentAccountInfo authenticate = new StudentAccountInfo();
		while(!authenticationStatus) {
			authenticate.authenticateStudent();
		}
		studentAuth.close();
		authenticationStatus = false;
		
	}
	
}

