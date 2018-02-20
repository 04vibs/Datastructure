
public class matRot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		// int a_rightRot[][] = rightRotate(a);
		// for (int i = 0; i <= a_rightRot.length - 1; i++) {
		// for (int j = 0; j <= a_rightRot[0].length - 1; j++) {
		// System.out.print(a_rightRot[i][j] + " ");
		// }
		// System.out.println("");
		// }
		// int a_leftRot[][] = leftRotate(a);
		System.out.println("The originl matrix is:");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[0].length - 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("The transpose is:");
		int a_transpose[][] = transpose(a);
		for (int i = 0; i <= a_transpose.length - 1; i++) {
			for (int j = 0; j <= a_transpose[0].length - 1; j++) {
				System.out.print(a_transpose[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static int[][] rightRotate(int a[][]) {
		a = transpose(a);
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j < a.length / 2; j++) {
				int x = a[i][j];
				a[i][j] = a[i][a[0].length - j - 1];
				a[i][a[0].length - j - 1] = x;
			}
		}
		return a;
	}

	public static int[][] leftRotate(int a[][]) {
		a = transpose(a);
		for (int i = 0; i < a.length / 2; i++) {
			for (int j = 0; j < a[0].length; j++) {
				int x = a[i][j];
				a[i][j] = a[a.length - 1 - i][j];
				a[a.length - 1 - i][j] = x;
			}
		}
		return a;
	}

	public static int[][] transpose(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[0].length; j++) {
				int x = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = x;
			}
		}
		return a;
	}

}
