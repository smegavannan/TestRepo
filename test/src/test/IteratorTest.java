package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");

		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object.equals("aaa"))
				iterator.remove();
		}
		System.out.println(list.toString());

		ListIterator<String> itr = list.listIterator();
		itr.add("aaaaaa");

		while (itr.hasNext()) {
			if (itr.next().equals("ccc"))
				itr.set("aaaaaa");
		}
		System.out.println(list.toString());
	}
}
