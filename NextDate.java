
public class NextDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nextDate("28February2015"));
	}

	public static String nextDate(String s) {
		String retVal = "";
		String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "Sepetember",
				"October", "November", "December" };
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int day = Integer.parseInt(s.substring(0, 2));
		int year = Integer.parseInt(s.substring(s.length() - 4));
		String month = s.substring(2, s.length() - 4);
		int count = -1;
		for (int i = 0; i <= months.length - 1; i++) {
			if (months[i].equals(month)) {
				count = i;
				break;
			}
		}
		if ((year % 4 == 0 || (year % 100 != 0 && year % 400 == 0)) && month.equals("February")
				&& (day == 28 || day == 29)) {
			if (day == 28) {
				retVal += "29February" + year;
			} else if (day == 29) {
				retVal += "1March" + year;
			}
		} else {
			if (day == days[count] && month.equals("December")) {
				retVal += "1" + "January" + (year + 1);
			} else if (day == days[count]) {
				retVal += "1" + months[count + 1] + year;
			} else {
				retVal += "" + (day + 1) + month + year;
			}
		}
		return retVal;
	}
	

}
