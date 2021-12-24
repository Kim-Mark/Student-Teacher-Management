
public class Student extends Person{
	
	private String studentID;
	private int grade;
	private double gpa;
	
	
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gpa) {
		super(name, age, height, weight); 
		this.studentID = studentID;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	// 출력할 수 있는 함수 만들기
	public void show() {
		System.out.println("===========================");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Height: " + getHeight());
		System.out.println("Weight: " + getWeight());
		System.out.println("Number: " + getStudentID());
		System.out.println("Grade: " + getGrade());
		System.out.println("GPA: " + getGpa());
	}

}
