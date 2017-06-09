import java.util.*;

public class num2 {
	public static void main(String args[]) {
		Set<Character> set = new HashSet<Character> ();
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		sc.close();
		for (int i = 0; i < n.length(); i++) {
			char a = n.charAt(i);
			if (set.contains(a) == false)
				set.add(a);
		}
		int len = set.size();
		if (len % 2 == 0) 
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
		System.exit(0); 
	}

}
