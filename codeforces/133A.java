import java.util.*;

public class hehexd {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		if (n.contains("H") || n.contains("Q") || n.contains("9"))
			System.out.println("YES");
		else 
			System.out.println("NO");
		System.exit(0);
	}
}
