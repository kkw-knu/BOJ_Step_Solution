import java.io.*;
import java.util.*;
public class BOJ_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st_1 = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st_1.nextToken()); //���� ī���� ����
		int M = Integer.parseInt(st_1.nextToken()); //�־��� ��
		int[] array = new int[N];//ī�带 ���� �迭�� ����
		int[] array_number = new int[3];//3���� ī�带 ���� �迭
		Arrays.fill(array_number, 0);
		StringTokenizer st_2 = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<N; i++) {// ��ī�尪�� �迭�� �����ϴ� �ܰ�
			array[i] = Integer.parseInt(st_2.nextToken());
		}
		int min = M;
		for(int a = 0;a<N-2;a++) {
			for(int b = a+1;b<N-1;b++) {
				for(int c = b+1;c<N;c++) {
					if((array[a]+array[b]+array[c])<=M) {
						if(min>M-(array[a]+array[b]+array[c])) {
							min = M-(array[a]+array[b]+array[c]);
							array_number[0] = array[a];
							array_number[1] = array[b];
							array_number[2] = array[c];
						}
					}
				}
			}
		}
		int sum=array_number[0]+array_number[1]+array_number[2];
		System.out.println(sum);
		br.close();
		bw.flush();
		bw.close();
	}
}
