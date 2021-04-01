import java.io.*;
import java.util.*;
public class BOJ_9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] array= new int[10001];
		Arrays.fill(array, 0);//배열 모든 값을 0으로 초기화
		array[1]=1;
		for(int a = 2;a<=10000;a++) { //에라토스테네스의 체를 사용하여 소수 판별
			for(int b = 2;a*b<=10000;b++) {
				array[a*b] = 1;
			}
		}
		int T = Integer.parseInt(br.readLine());//테스트케이스 갯수
		for(int a = 0; a<T; a++) {
			int n = Integer.parseInt(br.readLine()); //n을 입력받음
			for(int b = n/2, c = n/2;; b--, c++) { //절반으로 b와 c에 각각 변수 넣어줌
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
