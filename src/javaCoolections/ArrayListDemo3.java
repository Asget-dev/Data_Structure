package javaCoolections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// convert array to arrayList
		String arr[] = { "Dog", "Cat", "Elephant" };
		for (String value : arr) {
			System.out.println(value);
		}

		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);

		// BinarySearch
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
		System.out.println("Position of 21: " + Collections.binarySearch(list, 21));
	}

}
