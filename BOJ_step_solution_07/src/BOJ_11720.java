import java.io.*;
import java.util.*;
public class BOJ_11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		String s = br.readLine();
		int count = 0;
		for(int a=0;a<N;a++) {
			array[a] = s.charAt(a);
		}
		for(int a=0;a<N;a++) {
			count = count + Character.digit(array[a],10);
		}
		bw.write(String.valueOf(count));
		br.close();
		bw.flush();
		bw.close();
	}
}
