
public class LongestPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longest("bghiuytakhillihkahiif6f"));
	}

	public static String longest(String s) {
		String retVal = "";
		int maxLen = Integer.MIN_VALUE;
		for (int i = 0; i <= s.length() - 1; i++) {
			String temp = "";
			for (int j = i; j <= s.length() - 1; j++) {
				temp += s.charAt(j);
				StringBuffer sb = new StringBuffer(temp);
				sb.reverse();
				String temp2 = sb.toString();
//				System.out.println(temp2);
				if (temp.equals(temp2)) {
					if (temp.length() > maxLen) {
						maxLen = temp.length();
						retVal = temp;
					}
				}
			}
		}
		return retVal;
	}
}
