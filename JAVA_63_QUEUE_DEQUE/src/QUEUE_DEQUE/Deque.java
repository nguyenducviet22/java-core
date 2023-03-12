package QUEUE_DEQUE;

import java.util.ArrayDeque;

public interface Deque {
	public static void main(String[] args) {
		java.util.Deque<String> studentList = new ArrayDeque<String>();
		studentList.offer("Ng Van A");
		studentList.offer("Ph Duc D");
		studentList.offer("Le Thanh C");
		studentList.offer("Tr Van B");
		studentList.offerLast("Lu Thanh T");
		studentList.offerFirst("Ho Thanh G");
		
		while (true) {
			String name = studentList.poll();
			if (name==null) {
				break;
			}
			System.out.println(name);
		}
	}

}
