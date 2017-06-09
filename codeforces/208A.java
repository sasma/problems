import java.util.*;

public class xd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(remove(s));
	}
	
	static String remove(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (i <= s.length()-3 && s.substring(i, i+3).equals("WUB")) {
				i+=2;
				if (!res.equals(""))
					res+= " ";
			}
			else {
				res+= s.charAt(i);
			}
		}
		return res;
	}
}
