import java.util.Arrays;
import java.util.Scanner;

public class num2 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		int sum = 0;
		for (int i = 0 ; i < n; i ++) {
			int curr = sc.nextInt();
			sum+=curr;
			arr[i] = curr;
		}
		Arrays.sort(arr);
		System.out.println(algo(sum/2, arr, n));
		
	}

	public static int algo (int lim, int[] arr, int n) {
		int num = 0;
		int tempsum = 0;
		for (int i = n-1; i >= 0; i--) {
			int current = arr[i];
			tempsum+= current;
			num++;
			if (tempsum > lim) 
				break;
		}
		return num;
	}
}
