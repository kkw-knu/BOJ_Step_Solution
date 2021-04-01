import java.io.*;
import java.util.*;
public class BOJ_1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int start = 666;
		int count = 1;
		
		while(count !=N) {
			start++;
			if(String.valueOf(start).contains("666")) count++; 
		}
		System.out.println(start);
	}
}
