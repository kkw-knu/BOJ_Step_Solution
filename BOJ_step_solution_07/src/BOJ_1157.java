import java.io.*;
import java.util.*;
public class BOJ_1157 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] array = new int[s.length()];// �޾ƿ� ���ڿ��� �����ϴ� �迭
		int[] array2 = new int[26]; // ���ĺ��� ������ �������� �迭
		for(int a=0;a<s.length();a++) {//���ڿ��� �迭�� �ѱ��ھ� �����ϴ� ����
			for(int b=0;b<26;b++) {
				if(s.charAt(a)>=97) {
					array[a]=s.charAt(a)-97;
					if(array[a]==b) array2[b]++;
				}
				else {
					array[a]=s.charAt(a)-65;
					if(array[a]==b) array2[b]++;
				}
			}
		}
		int max = 0;
		int c = 0;
		int count = 0;
		for(int a=0;a<26;a++) {
			if(max<array2[a]) {
				max=array2[a];
				c=a+65;
			}
		}
		for(int a=0;a<26;a++) {
			if(max==array2[a]) {
				count++;
			}
		}
		if(count>=2) {
			bw.write("?");
		}
		else {
			char d = (char)c;
			bw.write(d);
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
