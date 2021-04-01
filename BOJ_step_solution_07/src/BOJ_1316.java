import java.io.*;
import java.util.*;
public class BOJ_1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count=0;
		for(int a=0;a<N;a++) {
			String s = br.readLine();
			count += check(s);
		}
		br.close();
		System.out.println(count);
	}
	public static int check(String s) {
		char[] array = new char[s.length()];
		for(int a = 0; a<s.length(); a++) { // 각 배열에 한 글자씩을 넣는다
			array[a] = s.charAt(a);
		}
		for(int a = 0; a<s.length()-1;a++) {
			if(array[a] != array[a+1]) {
				for(int b=a+1;b<s.length();b++) {
					if(array[a]==array[b]) return 0;
				}
			}
		}
		return 1;
	}
}
