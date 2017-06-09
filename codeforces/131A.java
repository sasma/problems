import java.util.*;

public class hehexd {
	public static boolean isAllCaps(String n) {
		for (int i = 0; i < n.length(); i++) {
			if (!Character.isUpperCase(n.charAt(i)))
				return false;
		}
		return true;
	}

	public static String toLowerCase(String n) {
		String str = "";
		str+= Character.toUpperCase(n.charAt(0));
		str+= n.substring(1, n.length()).toLowerCase();
		return str;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		if (Character.isLowerCase(n.charAt(0)) && isAllCaps(n.substring(1, n.length()))) {
			System.out.println(toLowerCase(n)); return;
		}
		else if (isAllCaps(n)) {
			System.out.println(n.toLowerCase()); 
			return;
		}
		else
			System.out.println(n);
		System.exit(0);
	}

}
