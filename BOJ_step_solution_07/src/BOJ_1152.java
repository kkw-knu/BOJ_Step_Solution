import java.io.*;
import java.util.*;
public class BOJ_1152 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] array = new int[s.length()];// �޾ƿ� ���ڿ��� �����ϴ� �迭
		for(int a = 0;a<s.length();a++) {
			array[a] = s.charAt(a);
		}
		int count = 0;//���� ī��Ʈ
		int count2 = 0;//�ܾ��� ������ ���� ī��Ʈ
		for(int a = 0;a<s.length();a++) {
			if(array[a]!=32) {//����� �����Ҷ�
				count++;
				if(count==1) count2++;
			}
			else if(array[a]==32){//����� ������ ��
				count=0;
			}
		}
		bw.write(String.valueOf(count2));
		br.close();
		bw.flush();
		bw.close();
	}
}
