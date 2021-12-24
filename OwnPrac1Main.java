import java.util.Scanner;

public class OwnPrac1Main {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nums of students: ");
		num = sc.nextInt();
		
		Student[] students = new Student[num];
		
		for(int i = 0; i < num; i++) {
			
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gpa;
			
			System.out.print("name: ");
			name = sc.next();
			System.out.print("age: ");
			age = sc.nextInt();
			System.out.print("height : ");
			height = sc.nextInt();
			System.out.print("weight : ");
			weight = sc.nextInt();
			System.out.print("Student Number : ");
			studentID = sc.next();
			System.out.print("Grade : ");
			grade = sc.nextInt();
			System.out.print("GPA : ");
			gpa = sc.nextDouble();
			
			students[i] = new Student(name, age, height, weight, studentID, grade, gpa);
		}
		
		for(int i = 0; i < num; i++) {
			students[i].show();
			}
		
		
	}

}
