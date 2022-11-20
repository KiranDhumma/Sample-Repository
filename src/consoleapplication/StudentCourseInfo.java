package consoleapplication;

import java.util.ArrayList;
import java.util.List;

public class StudentCourseInfo {
	
	private String studId;
	private String studCourseid;
	private String studCourseName;
	// private String enrollDate;
	static String enteredCourseId;
	static String enteredCourseName;
	
	static List<StudentCourseInfo> courseDetails = new ArrayList<>();
	
	
	public StudentCourseInfo(String studId, String studCourseid, String studCourseName, String enrolldate) {
		this.studId = studId;
		this.studCourseid = studCourseid;
		this.studCourseName = studCourseName;
		// this.enrolldate = enrolldate;
	}
	
	/* public StudentCourseInfo() {
		saveStudentCourseInfo();
	} */
	

	public static List<StudentCourseInfo> getCourseDetails() {
		return courseDetails;
	}
	
	

	public String getStudId() {
		return studId;
	}

	public String getStudCourseid() {
		return studCourseid;
	}

	public String getStudCourseName() {
		return studCourseName;
	}

	@Override
	public String toString() {
		return studId + "   " + studCourseid + "   " + studCourseName + " " + "08/11/2023";
	}

	public static void saveStudentCourseInfo() {
			
			String enteredStudId = StudentAccountInfo.getId();
			
			StudentAccountInfo myStudentInfo = new StudentAccountInfo();
			if(Enroll.checkExistingCourseId() != true) {
				for(StudentAccountInfo myInfo : myStudentInfo.getAccount()) {
					String savedSid = myInfo.getStudentId();
					// String savedSname;
					if(enteredStudId.equals(savedSid)) {
						// savedSname = myInfo.getName();
						// System.out.println(enteredStudId + " " + savedSname);
						enteredCourseId = Enroll.getNewCid();
						enteredCourseName = Enroll.getMyCname();
						
						courseDetails.add(new StudentCourseInfo(enteredStudId, enteredCourseId, enteredCourseName, "08/11/2022"));
						// break;
						// StudentCourseInfo myCourseInfo = new StudentCourseInfo(enteredCourseId, enteredCourseName, "08/11/2022");
						

						
				
						// System.out.println(getCourseDetails());
					}
					// System.out.println(getCourseDetails());

				}
				/* catch (Exception e){
					System.out.println("No Courses founds");
				} */
			}
			
			
			}

	public static void viewEnrolledCases() {
			// saveStudentCourseInfo();
		

		for(StudentCourseInfo myCourses : getCourseDetails()) {
			
			if(myCourses.getStudId().equals(StudentAccountInfo.getId())) {
				System.out.println(myCourses);

			}
			else if(courseDetails.size() == 0) {
				System.out.println("No courses found");

		}
		}
	}
	

	
	
	public static void main(String[] args) {
		// StudentCourseInfo myCourseDetails = new  StudentCourseInfo();
		// StudentCourseInfo.saveStudentCourseInfo();
		// myCourseDetails.courseDetails.add(new StudentCourseInfo("S101", "C1", "Java Basics", "08/11/2022"));
		// System.out.println(myCourseDetails.getCourseDetails());
		// myCourseDetails.viewEnrolledCases();
		viewEnrolledCases();
		// System.out.println(courseDetails);
		
		// System.out.println(Enroll.getNewCourseId());
		// checkExistingCourseId();
	}
}

