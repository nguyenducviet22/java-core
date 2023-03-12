package test;

import java.util.List;
import java.util.Scanner;

import main.Student;
import main.StudentList;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentList sl = new StudentList();
		int choose = 0;
		do {
			System.out.println("MENU:");
			System.out.println("Enter a number please");
			System.out.println(
							  "1. add students\n" 
							+ "2. print students list\n" 
							+ "3. check empty list?\n" 
							+ "4. count students\n"
							+ "5. make students list be empty\n" 
							+ "6. check student's existence through student code\n"
							+ "7. delete a student\n" 
							+ "8. find students through student name\n"
							+ "9. re-arrange students have score from high to low\n" 
							+ "0. exit from program");
			choose = sc.nextInt();
			sc.nextLine();

			switch (choose) {
			case 1://1. add students
				System.out.print("Enter student code: "); String studentCode = sc.nextLine();
				System.out.print("Enter fullname of student: "); String fullNameOfStudent = sc.nextLine();
				System.out.print("Enter year of birth of student: "); int yearOfBirth = sc.nextInt();
				System.out.print("Enter gpa of student: "); double gpa = sc.nextDouble();
				Student stu = new Student(studentCode, fullNameOfStudent, yearOfBirth, gpa);
				sl.addStudent(stu);
				break;
				
			case 2://2. print students list
				sl.printStudentList();
				break;
				
			case 3://3. check empty list?
				System.out.println("The student list is empty: " + sl.checkEmptyList());
				break;
				
			case 4://4. count students
				System.out.println("A number of students are: " + sl.countStudent());
				break;
				
			case 5://5. make students list be empty
				sl.makeListBeEmpty();
				break;
				
			case 6://6. check student's existence through student code
				System.out.print("Enter student code: "); studentCode = sc.nextLine();
				stu = new Student(studentCode);
				System.out.println("Check existence: " + sl.checkExistence(stu));
				break;
				
			case 7://7. delete a student
				System.out.print("Enter student code: "); studentCode = sc.nextLine();
				stu = new Student(studentCode);
				System.out.println("Delete student: " + sl.deleteStudent(stu));
				break;
				
			case 8://8. find students through student name
				System.out.print("Enter student name: "); fullNameOfStudent = sc.nextLine();
				System.out.println("Result is: "); 
				sl.findStudent(fullNameOfStudent);
				break;
			case 9://9. re-arrange students have score from high to low
				sl.re_arrageScore();
				sl.printStudentList();
				break;
			default:
				break;
			}
		} while (choose != 0);
	}
}
