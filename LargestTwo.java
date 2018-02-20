
public class LargestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestSubstringWithTwoDistinctCharacters("abcababababbaacdcddc"));
	}

	public static String largestSubstringWithTwoDistinctCharacters(String s) {
		String retVal = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			String temp = "";
			String characters = "";
			for (int j = i; j <= s.length() - 1; j++) {
				temp += s.charAt(j);
				if (temp.length() == 1) {
					characters += s.charAt(j);
				} else {
					if (characters.length() == 1) {
						if (!characters.contains(s.charAt(j) + "")) {
							characters += s.charAt(j);
						}
					} else if (characters.length() == 2) {
						if (characters.contains(s.charAt(j) + "")) {
							if (temp.length() > retVal.length()) {
								retVal = temp;
							}
						} else {
							break;
						}
					}
				}
			}
		}
		return retVal;
	}
}
