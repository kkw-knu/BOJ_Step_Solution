import java.io.*;
import java.util.*;
public class BOJ_9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] array= new int[10001];
		Arrays.fill(array, 0);//�迭 ��� ���� 0���� �ʱ�ȭ
		array[1]=1;
		for(int a = 2;a<=10000;a++) { //�����佺�׳׽��� ü�� ����Ͽ� �Ҽ� �Ǻ�
			for(int b = 2;a*b<=10000;b++) {
				array[a*b] = 1;
			}
		}
		int T = Integer.parseInt(br.readLine());//�׽�Ʈ���̽� ����
		for(int a = 0; a<T; a++) {
			int n = Integer.parseInt(br.readLine()); //n�� �Է¹���
			for(int b = n/2, c = n/2;; b--, c++) { //�������� b�� c�� ���� ���� �־���
				if(array[b]==0&&array[c]==0) {
					if(n==b+c) {
						bw.write(b+" "+c+"\n");
						break;
					}
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
