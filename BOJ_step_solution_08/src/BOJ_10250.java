import java.io.*;
import java.util.*;
public class BOJ_10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); //테스트케이스 개수
		for (int a = 0; a<T; a++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int H = Integer.parseInt(st.nextToken()),
			W = Integer.parseInt(st.nextToken()),
			N = Integer.parseInt(st.nextToken()); //각각의 값 입력
			int count = 0;
			for(int i = 1; i<=W;i++) {
				for(int b = 1; b<=H;b++) {
					count ++;
					if(count == N) bw.write(String.valueOf((b*100+i)+"\n"));
				}
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
