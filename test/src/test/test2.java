package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test2 {
	public static void main(String[] args) {
		Collection<String> words = new ArrayList<String>();

		words.add("Don't");
		words.add("change");
		words.add("me!");
		System.out.println("Before: " + words);
		
		for (Iterator iterator = words.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print("-->"+string.toUpperCase() + "_");
			
		}
		
		for (String word : words) {
			//System.out.print(word.toUpperCase() + "_");
		}
		System.out.println();
		System.out.println("After: " + words);
	}
}
