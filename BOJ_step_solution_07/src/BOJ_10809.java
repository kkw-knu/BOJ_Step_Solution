import java.io.*;
import java.util.*;
public class BOJ_10809 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] array = new int[s.length()];
		int[] array2 = new int[26];
		Arrays.fill(array2, -1);
		for(int a=0;a<s.length();a++) {
			array[a] = s.charAt(a);
			for(int b = 0; b<26; b++) {
				if(b==array[a]-97&&array2[b]==-1) array2[b] = a;
			}
		}
		for(int a=0;a<26;a++) {
			bw.write(String.valueOf(array2[a])+" ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
