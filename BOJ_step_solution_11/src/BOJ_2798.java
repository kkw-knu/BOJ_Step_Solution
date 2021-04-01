import java.io.*;
import java.util.*;
public class BOJ_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st_1 = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st_1.nextToken()); //블랙잭 카드의 개수
		int M = Integer.parseInt(st_1.nextToken()); //주어진 수
		int[] array = new int[N];//카드를 담을 배열의 개수
		int[] array_number = new int[3];//3장의 카드를 담을 배열
		Arrays.fill(array_number, 0);
		StringTokenizer st_2 = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<N; i++) {// 각카드값을 배열에 저장하는 단계
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
