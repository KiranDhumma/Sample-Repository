package consoleapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Enroll {
	// static String cN;
	static String myCname;
	static String newCid;
	static String newCourseId;
	
	Scanner newCourse;
	
	static List<StudentCourseInfo> courseDetails = new ArrayList<>();
	
	public Scanner getNewCourse() {
		return newCourse;
	}
	

	public static String getNewCid() {
		return newCid;
	}
	

	public static String getMyCname() {
		return myCname;
	}

	public static String getNewCourseId() {
		return newCourseId;
	}


	public static void setMyCname(String myCname) {
		Enroll.myCname = myCname;
	}
	
	

	public static void courseName(String cId) {
		Courses myCourseName = new Courses();
		if(checkExistingCourseId() != true) {
			for(Courses myNewCourse : myCourseName.getCourse()) {
				newCid = myNewCourse.getCourseId();
				if (newCid.equals(cId)) {
					myCname = myNewCourse.getCourseName();
					// System.out.println("You are successfully enrolled in " + myCname +"!");
					
				}
				else {
					myCname = null;
					// System.out.println("Enter Valid Course Id");
				}
				if(myCname != null) {
					break;
				}
			}
				
			if(myCname != null) {
				System.out.println("You are successfully enrolled in " + myCname +"!");
				// return myCname;
			}
			else {
				System.out.println("Enter Valid Course Id");
				// return null;
			}
		}
		else {
			System.out.println("Course already exists!");
		}


	}
	
	
	
	/* @Override
	public String toString() {
		return courseName();
	} */



	public String newEnrollment() {
		newCourse = new Scanner(System.in);
		System.out.println("Enter Course ID");
		newCourseId = newCourse.nextLine();
		courseName(newCourseId);
		StudentCourseInfo.saveStudentCourseInfo();
		return newCourseId;
		
	}
	
	public static boolean checkExistingCourseId() {
		String courseExists = null;
		String enteredStudentId = StudentAccountInfo.getId();
		for(StudentCourseInfo myExistingCourses : StudentCourseInfo.getCourseDetails()) {
			String courseId = myExistingCourses.getStudCourseid();
			String studId = myExistingCourses.getStudId();
			if((courseId.equals(newCourseId)) && (enteredStudentId.equals(studId))){
				courseExists = "Course already exists";
			}
			
			else {
				courseExists = null;
				
			}
			if(courseExists != null) {
				break;
			}
		}
			if(courseExists != null) {
				// System.out.println("Course already exists");
				System.out.println();
				return true;
			}
			else {
				return false;
			}
			}
	
	
	public void studentCourseInfo() {

	}
	
	
	
	public static void main(String[] args) {
		Enroll myCourseName = new Enroll();
		// myCourseName.studentCourseInfo();
		
		
		// courseName("C4");
		// System.out.println(myCourseName.courseName());
		// myCourseName.newEnrollment();

		myCourseName.newEnrollment();
		
		
		// System.out.println(myCourseDetails.courseDetails);
	}
	
}
