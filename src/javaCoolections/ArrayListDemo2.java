package javaCoolections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");

		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);

		al_dup.removeAll(al_dup);
		System.out.println("After removing :" + al_dup);

		// Sort --- Collections.sort() //from collection class
		System.out.println("Elements in the array list:" + al);
		Collections.sort(al);
		System.out.println("Element in the array list after sorting:" + al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elemnt in the array list after sorting reverse order: " + al);

		// Shuffiling - Collections. shuffle()
		Collections.shuffle(al);
		System.out.println("Element in the array list after Shuffling: " + al);
	}

}
