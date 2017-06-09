import java.util.*;
public class CTCI1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("Type in a string!");
		a = sc.nextLine();
		sc.close();
		Map <Character, Integer> myMap = new HashMap<Character, Integer> ();
		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);	
			if (myMap.containsKey(b)) {
				myMap.put(b, myMap.get(b) + 1);
			}
			else {
				myMap.put(b, 1);
			}
		}
		boolean ans = false;
		for (Integer value : myMap.values()) {
			System.out.print(value + " ");
			if (value > 1) {
				ans = true;
			}
		}
		System.out.println();
		if (ans) {
			System.out.println("This string has repeated characters.");
		}
		else {
			System.out.println("The string is unique!");
		}
	}
}
