import java.io.*;
import java.util.*;
public class BOJ_1152 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] array = new int[s.length()];// 받아온 문자열을 저장하는 배열
		for(int a = 0;a<s.length();a++) {
			array[a] = s.charAt(a);
		}
		int count = 0;//띄어쓰기 카운트
		int count2 = 0;//단어의 갯수를 위한 카운트
		for(int a = 0;a<s.length();a++) {
			if(array[a]!=32) {//영어로 시작할때
				count++;
				if(count==1) count2++;
			}
			else if(array[a]==32){//띄어쓰기로 시작할 때
				count=0;
			}
		}
		bw.write(String.valueOf(count2));
		br.close();
		bw.flush();
		bw.close();
	}
}
