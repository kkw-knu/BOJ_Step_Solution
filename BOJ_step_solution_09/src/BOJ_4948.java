import java.io.*;
import java.util.*;
public class BOJ_4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int N = Integer.parseInt(br.readLine());
			int count = 0;
			if(N==0) break;
			else if(N==1) bw.write("1"+"\n");
			else {
				int[] array = new int[(2*N)+1]; // 2N+1�� �迭 ����
				Arrays.fill(array, 0); //��� �迭���� 0���� �ʱ�ȭ
				array[1]=1;
				for(int a=2;a<=2*N;a++) {
					for(int b=2;b*a<=2*N;b++) { //��� a�� ����� �迭�� 1�� ä�� ǥ��
						array[a*b] = 1;
					}
				}
				for(int a = N+1; a<=2*N; a++) {
					if(array[a]!=1) count += 1;
				}
				bw.write(count+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
