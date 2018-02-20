
public class Sinusoidal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		int minRow = 0;
		int minCol = 0;
		int maxRow = a.length - 1;
		int maxCol = a[0].length - 1;
		while (minRow <= maxRow && minCol <= maxCol) {
			for (int i = minCol; i <= maxCol; i++) {
				System.out.print(a[minRow][i] + " ");
			}
			minRow++;
			for (int i = minRow; i <= maxRow; i++) {
				System.out.print(a[i][maxCol] + " ");
			}
			maxCol--;
			for (int i = maxCol; i >= minCol; i--) {
				System.out.print(a[maxRow][i] + " ");
			}
			maxRow--;
			for (int i = maxRow; i >= minRow; i--) {
				System.out.print(a[i][minCol] + " ");
			}
			minCol++;
		}
	}

}
