
public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 5, 7, 9 };
		int b[] = { 2, 4, 6, 8 };
		int c[] = mergeTwoSortedLists(a, b);
		for (int i = 0; i <= c.length - 1; i++) {
			System.out.print(c[i] + " ");
		}
	}

	public static int[] mergeTwoSortedLists(int a[], int b[]) {
		int firstStart = 0, secondStart = 0, newStart = 0;
		int c[] = new int[a.length + b.length];
		while (firstStart < a.length-1 || secondStart < b.length-1) {
			if (a[firstStart] <= b[secondStart]) {
				c[newStart] = a[firstStart];
				newStart++;
				firstStart++;
			} else if (a[firstStart] > b[secondStart]) {
				c[newStart] = b[secondStart];
				newStart++;
				secondStart++;
			}
		}
		
		return c;
	}

}
