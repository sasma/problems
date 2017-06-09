import java.util.Scanner;
import java.util.ArrayList;

public class num2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(method(n));
		System.exit(0);
	}

	public static String method(int n) {
		int num = n;
		ArrayList <Integer> list  = genList(num);
		boolean result = false;
		
		for (Integer i : list) {
			if (n % i == 0) 
				result = true;
		}
		if (result)
			return "YES";
		else
			return "NO";
	}
	
	public static ArrayList<Integer> genList(int n)  {
		ArrayList<Integer> result = new ArrayList <Integer> ();
		for (int i = 1; i <= n; i++) {
			String tempstr = i + "";
			if (isLucky(tempstr))
				result.add(i);
		}
		return result;
	}
	
	public static boolean isLucky(String n) {
		boolean bool = true;
		for (int i = 0; i < n.length(); i++) {
			char a = n.charAt(i);
			if (Character.getNumericValue(a) == 4 || Character.getNumericValue(a) == 7)
				;
			else  {
				bool = false;
				break;
			}
		}
		return bool;
	}
}
