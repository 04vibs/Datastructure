import java.io.*;
import java.util.*;

public class Words_frequency {
	public static void main(String args[]) throws IOException {
		System.out.println("enter");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ArrayList<String> al = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			int count = 0;
			String temp = st.nextToken();
			boolean flag = false;
			for (int i = 0; i <= al.size() - 1; i++) {
				if (al.get(i).equals(temp)) {
					flag = true;
				}
			}
			if (!flag) {
				al.add(temp);
				StringTokenizer st1 = new StringTokenizer(s);
				while (st1.hasMoreTokens()) {
					if (st1.nextToken().equals(temp)) {
						count++;
					}
				}
				System.out.println(temp + "-" + count);
			}
		}
	}
}
//this this this is is good 