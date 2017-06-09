import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class cf1B {
	private Scanner in;
	private PrintWriter out;
	
	public void solve()
	{
		String str = in.next();
		
		List<String> sp = new ArrayList<String>();
		StringBuilder sb = null;
		int kind = -1;
		
		//loop through the input string
		for(int i = 0;i < str.length();i++){
			char c = str.charAt(i);
			//checks if the character is a letter
			if(c >= 'A' && c <= 'Z' && kind != 0){
				//if stringbuilder isnt empty, add it to the list then reset stringbuilder
				if(sb != null){
					sp.add(sb.toString());
				}
				sb = new StringBuilder();
				kind = 0;
			}
			//checks if character is a letter
			if(c >= '0' && c <= '9' && kind != 1){
				//if stringbuilder isnt empty, add it to the list then reset stringbuilder
				if(sb != null){
					sp.add(sb.toString());
				}
				sb = new StringBuilder();
				kind = 1;
			}
			//kind denotes that the last character was a letter or a number, and if the character is still a letter/number it will
			//be added. if the type changes, then the two if loops will accomodate for it
			sb.append(c);
		}
		//add anything thats left to the list
		sp.add(sb.toString());
	
		//actual translation
		//if there are two strings in the list then its in BC23 format, with string 1 = "BC" and string 2 = "23"
		if(sp.size() == 2){
			// BC23
			String bc = sp.get(0);
			int v = 0;
			for(int i = 0;i < bc.length();i++){
				v = 26 * v + (bc.charAt(i) - 'A' + 1);
			}
			
			out.println("R" + sp.get(1) + "C" + Integer.toString(v));
		}else{
			// R23C55
			//get the "55" from the list
			int v = Integer.parseInt(sp.get(3));
			StringBuilder sbb = new StringBuilder();
			for(;v > 0;v/=26){
				v--;
				sbb.append((char)((v % 26) + 'A'));
			}
			sbb.reverse();
			//add the original number as ROW doesn't change, you only need to convert the column to letter
			out.println(sbb.toString() + sp.get(1));
		}
		
		out.flush();
	}
	
	public void run() throws Exception
	{
		in = new Scanner(System.in);
		out = new PrintWriter(System.out);
		
		int n = in.nextInt();
		for(int i = 1;i <= n;i++){
			solve();
		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		new cf1B().run();
	}
	
}
