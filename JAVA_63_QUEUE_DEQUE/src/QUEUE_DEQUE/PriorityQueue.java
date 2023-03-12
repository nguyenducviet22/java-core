package QUEUE_DEQUE;

import java.util.Queue;
//import java.util.PriorityQueue;

public class PriorityQueue {
	public static void main(String[] args) {
		Queue<String> studentList = new java.util.PriorityQueue<String>();
		
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
