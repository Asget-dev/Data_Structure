package javaCoolections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// Declare ArrayList
		// ArrayList a1 = new ArrayList();
		// ArrayList <Integer> a1 = new ArrayList<String>();//to use homogeinuse
		// List a1 = new ArrayList();
		// ArrayList <String>a1 = new ArrayList<String>();

		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add("Wlcome");
		a1.add(15.5);
		a1.add('A');
		a1.add(true);

		System.out.println(a1);
		System.out.println(a1.size());

		// to remove
		// a1.remove(1);// here 1 is index
		System.out.println(a1);
		a1.add(2, "Python");

		// to retreive specific element
		System.out.println(a1.get(2));// 2 is index of element/ objcet
		a1.set(2, "C#");
		System.out.println("After replacing element: " + a1);
		// search - contains(); - Returns true/ false
		System.out.println(a1.contains("C#"));
		System.out.println(a1.contains("C++"));

		// isEmpty()
		System.out.println(a1.isEmpty());

		// how to read a data
		// (1)for loop
		System.out.println("Reading elements using for loop");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("Reading elements using for loop each loop");
		// (2)for..each loop
		for (Object e : a1) {
			System.out.println(e);
		}
		System.out.println("Reading elements using for loop each iterator");
		// (3)iterator()
		Iterator it = a1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
