package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {

	private ArrayList<Student> list;

	public StudentList() {
		this.list = new ArrayList<Student>();
	}

	public StudentList(ArrayList<Student> list) {
		this.list = list;
	}

	// 1. add students
	public void addStudent(Student stu) {
		this.list.add(stu);
	}

	// 2. print students list
	public void printStudentList() {
		for (Student student : list) {
			System.out.println(student);
		}
	}

	// 3. check empty list?
	public boolean checkEmptyList() {
		return this.list.isEmpty();
	}

	// 4. count students
	public int countStudent() {
		return this.list.size();
	}

	// 5. make students list be empty
	public void makeListBeEmpty() {
		this.list.removeAll(list);
	}

	// 6. check student's existence through student code
	public boolean checkExistence(Student stu) {
		return this.list.contains(stu);
	}

	// 7. delete a student
	public boolean deleteStudent(Student stu) {
		return this.list.remove(stu);
	}

	// 8. find students through student name
	public void findStudent(String name) {
		for (Student student : list) {
			if (student.getFullNameOfStudent().indexOf(name) >= 0) {
				System.out.println(student);
			}
		}
	}

	// 9. re-arrage students have score from high to low
	public void re_arrageScore() {
		Collections.sort(this.list, new Comparator<Student>() {
			@Override
			public int compare(Student stu1, Student stu2) {
				if (stu1.getGpa() > stu2.getGpa()) {
					return 1;
				} else if (stu1.getGpa() < stu2.getGpa()) {
					return -1;
				} else {
					return 0;
				}

			}
		});
		;
	}
}
