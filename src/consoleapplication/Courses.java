package consoleapplication;

public class Courses {
	private String courseId;
	private String courseName;
	private String difficultyLevel;
	private String duration;
	private Courses[] course = new Courses[4];
	
	public String getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public String getDuration() {
		return duration;
	}
	
	public Courses[] getCourse() {
		return course;
	}
	public Courses(String courseId, String courseName, String difficultyLevel, String duration) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.difficultyLevel = difficultyLevel;
		this.duration = duration;
	}
	public Courses() {
		course[0] = new Courses("C1", "Java Basics", "Low", "3 hrs");
		course[1] = new Courses("C2", "Advanced Java Tutorial", "Medium", "4 hrs");
		course[2] = new Courses("C3", "SQL developers course", "Medium", "4 hrs");
		course[3] = new Courses("C4", "DevOps Tutorial", "High", "5 hrs");
	}

	public void displayAllCourses() {
		


		System.out.println("-------------------------------------------------------------------------------");
		System.out.printf("%-15s%-30s%-20s%-20s", "Course Id", "Name", "Difficulty Level", "Duration");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");
		for(Courses myCourse : course) {
			String myCourseId = myCourse.getCourseId();
			String myCourseName = myCourse.getCourseName();
			String myCourseDifficulty = myCourse.getDifficultyLevel();
			String myCourseDuration = myCourse.getDuration();
			
			System.out.printf("%-15s%-30s%-20s%-20s", myCourseId, myCourseName, myCourseDifficulty,
					myCourseDuration);
			System.out.println();
		}
		
	}

	public static void main(String[] args){
		Courses allCourses = new Courses();
		allCourses.displayAllCourses();
	}

}
