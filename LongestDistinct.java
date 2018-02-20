
public class LongestDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 8, 191, 14, 99, 726, 5, 4, 9, 91 };
		int first, second, third;
		first = second = third = Integer.MIN_VALUE;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				int temp = a[i] + a[j];
				if (temp > first) {
					third = second;
					second = first;
					first = temp;
				} else if (temp > second) {
					third = second;
					second = temp;
				} else if (temp > third) {
					third = temp;
				}
			}
		}
		System.out.println("Max= " + first + "  SecMAx= " + second + "   ThirdMax= " + third);
	}

}
