import java.io.*;
import java.util.*;
public class BOJ_4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st ;
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken()),
				b = Integer.parseInt(st.nextToken()),
				c = Integer.parseInt(st.nextToken());
			
			if(a==0&&b==0&&c==0) break;
			if(Math.pow(a, 2)==Math.pow(b,2) + Math.pow(c,2)) {
				bw.write("right\n");
			}
			else if(Math.pow(b, 2)==Math.pow(a,2) + Math.pow(c,2)) {
				bw.write("right\n");
			}
			else if(Math.pow(c, 2)==Math.pow(b,2) + Math.pow(a,2)) {
				bw.write("right\n");
			}
			else bw.write("wrong\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
