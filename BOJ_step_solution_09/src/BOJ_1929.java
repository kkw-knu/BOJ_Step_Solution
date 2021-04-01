import java.io.*;
import java.util.*;
public class BOJ_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int M = Integer.parseInt(st.nextToken()); //N
		int N = Integer.parseInt(st.nextToken()); //N
		int[] array = new int[N+1]; // N+1�� �迭 ����
		Arrays.fill(array, 0); //��� �迭���� 0���� �ʱ�ȭ
		array[1]=1;
		for(int a=2;a<=N;a++) {
			for(int b=2;b*a<=N;b++) { //��� a�� ����� �迭�� 1�� ä�� ǥ��
				array[a*b] = 1;
			}
		}
		for(int a = M; a<=N; a++) {
			if(array[a]!=1) bw.write(a+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
