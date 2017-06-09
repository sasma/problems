import java.util.*;

public class 158A {
	public static void main(String args[]) {		
		ArrayList <Integer> list = new ArrayList <Integer>();
		//input stream
		Scanner scan = new Scanner(System.in);
		//j denotes number of contestant, n is the nth contestant
		int j, n;
		j = scan.nextInt();
		n = scan.nextInt();
		//create a list add all contestants, save the nth contestants score
		int score = 0;
		for (int i = 0; i < j; i++) {
			int temp = scan.nextInt();
			list.add(temp);
			if (i == n-1)
				score = temp;	
		}
		scan.close();
		//score is the threshold for contestants to win
		int result = 0;
		//go through the list again and see how many won
		for (int i = 0; i < j; i++) {
			if (list.get(i) >= score && list.get(i) > 0 )
				result++;
		}
		//print
		System.out.println(result);
		System.exit(0);
	}
}
