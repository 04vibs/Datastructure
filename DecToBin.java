
public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		Integer a = nextHigher(num);
		for (int i = num; i <= a; i++) {
			printArray(binaryConverter(i));
		}
		System.out.println(a);
	}

	public static void printArray(Integer a[]) {
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public static Integer[] binaryConverter(Integer num) {
		int length = 0;
		int i = 0;
		while (true) {
			if (Math.pow(2, i) > num) {
				length = i;
				break;
			}
			i++;
		}
		Integer retVal[] = new Integer[length];
		for (int j = 0; j <= retVal.length - 1; j++) {
			retVal[j] = num % 2;
			num = num / 2;
		}
		return retVal;
	}

	public static Integer nextHigher(Integer num) {
		Integer a[] = binaryConverter(num);
		int countOfZeroes = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == 0) {
				countOfZeroes++;
			}
		}
		int nextHigher = num;
		while (true) {
			nextHigher++;
			int tempCount = 0;
			Integer b[] = binaryConverter(nextHigher);
			for (int i = 0; i <= b.length - 1; i++) {
				if (b[i] == 0) {
					tempCount++;
				}
			}
			if (tempCount == countOfZeroes) {
				break;
			}
		}
		return nextHigher;
	}
}
