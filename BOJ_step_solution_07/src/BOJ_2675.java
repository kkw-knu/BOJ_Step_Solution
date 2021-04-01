import java.io.*;
import java.util.*;
public class BOJ_2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int x = 0; x<N; x++) {//테스트케이스 갯수
			String s = br.readLine();
			char[] array = new char[s.length()];
			for(int a = 0; a<s.length();a++) {
				array[a]=s.charAt(a);
			}
			int number = Character.digit(array[0], 10);
			for(int a = 2;a<s.length();a++) {
				for(int b = 0;b<number;b++) {
					bw.write((char)array[a]);
				}
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
