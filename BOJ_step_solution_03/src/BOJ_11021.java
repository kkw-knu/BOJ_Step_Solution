import java.io.*;
import java.util.*;
public class BOJ_11021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i =1;i<=N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
