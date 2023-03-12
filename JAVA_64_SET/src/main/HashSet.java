package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;

public class HashSet {
	Set<String> ticketBox = new java.util.HashSet<String>();
	
	public HashSet() {
	}

	public boolean addTicket(String value) {
		return this.ticketBox.add(value);
	}
	
	public boolean deleteTicket(String value) {
		return this.ticketBox.remove(value);
	}
	
	public boolean checkExist(String value) {
		return this.ticketBox.contains(value);
	}
	
	public void deleteAll() {
		this.ticketBox.clear();
	}
	
	public int countTiclet() {
		return this.ticketBox.size();
	}
	
	public void printTicket() {
		System.out.println(Arrays.toString(this.ticketBox.toArray()));
	}
	
	public String drawTicket() {
		String result = "";
		Random rd = new Random();
		int ticketNum = rd.nextInt(this.ticketBox.size());
		result = (String) this.ticketBox.toArray()[ticketNum];
		return result;
	}
}
