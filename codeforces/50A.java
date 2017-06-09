import java.util.*;

public class throwaway {
	public static void main(String args[]) {		
		//input stream
		Scanner scan = new Scanner(System.in);
		int one = scan.nextInt();
		int two = scan.nextInt();
		scan.close();
		
		int area = one*two;
		int domino = 2;
		
		int result = Math.floorDiv(area, domino);
		System.out.println(result);
	}
}
