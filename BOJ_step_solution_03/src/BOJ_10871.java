import java.io.*;
import java.util.*;
public class BOJ_10871 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1;
		StringTokenizer st2;
		
		st1 = new StringTokenizer(br.readLine()," ");
		st2 = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st1.nextToken());
		int X = Integer.parseInt(st1.nextToken());
		
		int array[] = new int[N]; //배열의 방 갯수 설정
		
		for (int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st2.nextToken()); // 각각에변수에 숫자를 넣어준다
		}
		
		for(int i = 0;i<N;i++) { //배열의 크기만큼돌린다 
			if(array[i] < X) {
				bw.write(String.valueOf(array[i]));
				bw.write(" ");
			
			}
		}
		

		br.close();
		bw.flush();
		bw.close();

	}
}
