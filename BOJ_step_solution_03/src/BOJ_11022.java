import java.io.*;
import java.util.*;
public class BOJ_11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i =1;i<=N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();	
	}	
}
