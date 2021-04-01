import java.io.*;
import java.util.*;
public class BOJ_1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); // 테스트케이스 갯수
		for(int a=0;a<T;a++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken()),
			    y = Integer.parseInt(st.nextToken()); // 좌표값의 입력
			int total = y-x; //총 이동해야 하는 거리
			long maximum = 0;
			int i;
			for(i = 1; maximum<total;i++) {
				maximum += (i+1)/2;
			}
			bw.write(String.valueOf(i-1)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
