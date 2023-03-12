package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class TreeMap {
	private Map<String, String> data = new java.util.TreeMap<String, String>();
	
	public String putWord(String word, String meaning) {
		return this.data.put(word, meaning);
	}
	
	public String removeWord(String word) {
		return this.data.remove(word);
	}
	
	public String searchWord(String word) {
		String meaning = this.data.get(word);
		return meaning;
	}
	
	public void printAllWords() {
		Set<String> wordBox = this.data.keySet();
		System.out.println(Arrays.toString(wordBox.toArray()));
	}
	
	public int countWord() {
		return this.data.size();
	}
	
	public void deleteAll() {
		this.data.clear();
	}
}
