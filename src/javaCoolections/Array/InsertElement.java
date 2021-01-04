package javaCoolections.Array;

public class InsertElement {
	int count = 0;

	public static void main(String[] args) {
		InsertElement o = new InsertElement();

		int a[] = new int[5];
		// to insert array using loop
		for (int j = 0; j < a.length; j++) {
			o.insert(a, j);
		}

		for (int j = 0; j < a.length; j++) {
			a[j] = j;
			System.out.print(a[j] + " ");
		}

	}

	public void insert(int a[], int val) {
		a[count++] = val;
	}
}
