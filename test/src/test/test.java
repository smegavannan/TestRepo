package test;

import java.util.ArrayList;
import java.util.Collection;

public class test {
	public static void main(String[] args) {
		int sum = 0;
		for (int i : makeCollection()){
			System.out.println(i);
			System.out.println(sum);
			sum += i;
			System.out.println("sum here :"+sum);
		}
		System.out.println(sum);
	}

	static Collection<Integer> makeCollection() {
		System.out.println("A collection coming up.");
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(10);
		collection.add(20);
		collection.add(30);
		return collection;
	}
}
