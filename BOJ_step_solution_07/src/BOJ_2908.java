import java.io.*;
import java.util.*;
public class BOJ_2908 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] array = new int[s.length()];// 받아온 문자열을 저장하는 배열
		for(int a = 0;a<s.length();a++) {
			array[a] = Character.digit(s.charAt(a), 10);
		}
		int A = array[2]*100 + array[1]*10 + array[0];
		int B = array[6]*100 + array[5]*10 + array[4];
		if(A>B) {
			bw.write(String.valueOf(A));			
		}
		else bw.write(String.valueOf(B));
		br.close();
		bw.flush();
		bw.close();
	}
}
