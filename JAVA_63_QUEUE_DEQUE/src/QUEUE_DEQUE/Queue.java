package QUEUE_DEQUE;

import java.util.LinkedList;
//import java.util.Queue;

public class Queue {
	public static void main(String[] args) {
		java.util.Queue<String> studentList = new LinkedList<String>();
		
		studentList.offer("Ng Van A");
		studentList.offer("Ph Duc D");
		studentList.offer("Le Thanh C");
		studentList.offer("Tr Van B");
		
		while (true) {
			String name = studentList.poll();
			if (name==null) {
				break;
			}
			System.out.println(name);
		}
	}
}
