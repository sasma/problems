import java.util.Scanner;
import java.lang.StringBuilder;

public class codeforces266A {
	public static boolean allSame(String n) {
		for (int i = 0; i < n.length()-1; i++) {
			if (n.charAt(i) != n.charAt(i+1))
				return false;
		}
		return true;
	}
	public static void main (String[] args) {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		if (allSame(s)) {
			System.out.println(n-1);
			System.exit(0);
		}
		for (int i = 0; i < n-1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				total++;
				sb.deleteCharAt(i);
				s = sb.toString();
				//System.out.println(s);
				n--;
				i--;
			}
		}
		System.out.println(total);
		System.exit(0);
	}

}
