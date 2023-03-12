package main;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private String studentCode;
	private String fullNameOfStudent;
	private int yearOfBirth;
	private double gpa;
	
	public Student(String studentCode) {
		this.studentCode = studentCode;
	}

	public Student(String studentCode, String fullNameOfStudent, int yearOfBirth, double gpa) {
		this.studentCode = studentCode;
		this.fullNameOfStudent = fullNameOfStudent;
		this.yearOfBirth = yearOfBirth;
		this.gpa = gpa;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getFullNameOfStudent() {
		return fullNameOfStudent;
	}

	public void setFullNameOfStudent(String fullNameOfStudent) {
		this.fullNameOfStudent = fullNameOfStudent;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", fullNameOfStudent=" + fullNameOfStudent + ", yearOfBirth="
				+ yearOfBirth + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.studentCode.compareTo(o.studentCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentCode, other.studentCode);
	}

}
