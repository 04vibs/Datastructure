import java.io.*;

public class ChakarPractice {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("e");
		int n = Integer.parseInt(br.readLine());
		int a[][] = new int[n][n];
		int minRow = 0, minCol = 0, maxRow = n - 1, maxCol = n - 1, count = 0;
		while (maxRow >= minRow && maxCol >= minCol) {
			for (int i = minCol; i <= maxCol; i++) {
				a[minRow][i] = count++;
			}
			minRow++;
			for (int i = minRow; i <= maxRow; i++) {
				a[i][maxCol] = count++;
			}
			maxCol--;
			for (int i = maxCol; i >= minCol; i--) {
				a[maxRow][i] = count++;
			}
			maxRow--;
			for (int i = maxRow; i >= minRow; i--) {
				a[i][minCol] = count++;
			}
			minCol++;
		}
		for (int i = 0; i <= n - 1; i++) {
			System.out.print("--\t");
		}
		System.out.println("");
		for (int i = 0; i <= n - 1; i++) {
			System.out.print("|");
			for (int j = 0; j <= n - 1; j++) {
				if (j == n - 1)
					System.out.print(a[i][j]);
				else
					System.out.print(a[i][j] + "\t");
			}
			System.out.print("|");
			System.out.println("");
		}
		for (int i = 0; i <= n - 1; i++) {
			System.out.print("--\t");
		}
	}

}
