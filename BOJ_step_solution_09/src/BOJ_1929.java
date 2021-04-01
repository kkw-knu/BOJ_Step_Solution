import java.io.*;
import java.util.*;
public class BOJ_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int M = Integer.parseInt(st.nextToken()); //N
		int N = Integer.parseInt(st.nextToken()); //N
		int[] array = new int[N+1]; // N+1의 배열 생성
		Arrays.fill(array, 0); //모든 배열값을 0으로 초기화
		array[1]=1;
		for(int a=2;a<=N;a++) {
			for(int b=2;b*a<=N;b++) { //모든 a의 배수의 배열에 1을 채워 표시
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
