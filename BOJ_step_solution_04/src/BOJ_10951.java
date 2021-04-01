import java.io.*;
import java.util.*;
public class BOJ_10951 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String s = null;
		int a,b;
		
		while((s=br.readLine()) != null&&s.length()!=0) {
			st = new StringTokenizer(s," ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
