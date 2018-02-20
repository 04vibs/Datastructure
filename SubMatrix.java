
public class SubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int M = 3;
		int largest = Integer.MIN_VALUE;
		int largestArray[][] = new int[M][M];
		for (int i = 0; i <= a.length - 1 - M + 1; i++) {
			for (int j = 0; j <= a.length - 1 - M + 1; j++) {
				int temp = 0;
				int tempArray[][] = new int[M][M];
				int countRow = 0;
				int countCol = 0;
				for (int k = i; k <= i + M - 1; k++) {
					for (int l = j; l <= j + M - 1; l++) {
						tempArray[countRow][countCol++] = a[k][l];
						temp += a[k][l];
					}
					countRow++;
					countCol = 0;
				}
				if (largest <= temp) {
					largestArray = tempArray;
					largest = temp;
				}
			}
		}
		System.out.println(largest);
		for (int i = 0; i <= M - 1; i++) {
			for (int j = 0; j <= M - 1; j++) {
				System.out.print(largestArray[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
