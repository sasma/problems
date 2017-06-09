import java.util.*;

public class helloworld {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			String n = sc.nextLine();
			if (n.length() <= 10)
				System.out.println(n);
			else {
				char fir = n.charAt(0);
				char las = n.charAt(n.length()-1);
				String p = (n.length() - 2) + "";
				String result = fir + p + las;
				System.out.println(result);
			}
		}
		System.exit(0);
	}

}
