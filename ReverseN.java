import java.io.*;

public class ReverseN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int b[] = reverse(a, 3);
		for (int i = 0; i <= b.length - 1; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static int[] reverse(int a[], int N) {
		int retVal[] = new int[a.length];
		int count = 0;
		for (int i = N - 1; i >= 0; i--) {
			retVal[count++] = a[i];
		}
		for (int i = N; i <= a.length - 1; i++) {
			retVal[count++] = a[i];
		}
		return retVal;
	}

}
