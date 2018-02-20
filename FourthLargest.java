
public class FourthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -3, -8, -191, -14, -99, -726, -5, -4, -9, -91 };
		int first, second, third, fourth;
		first = second = third = fourth = Integer.MIN_VALUE;
		if (a.length < 4)
			System.out.println("Array length is lesser than 4");
		else {
			for (int i = 0; i <= a.length - 1; i++) {
				if (a[i] > first) {
					fourth = third;
					third = second;
					second = first;
					first = a[i];
				} else if (a[i] > second) {
					fourth = third;
					third = second;
					second = a[i];
				} else if (a[i] > third) {
					fourth = third;
					third = a[i];
				} else if (a[i] > fourth) {
					fourth = a[i];
				}
			}
			System.out.println(fourth);
		}
	}
}