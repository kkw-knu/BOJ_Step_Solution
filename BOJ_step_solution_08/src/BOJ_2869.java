import java.io.*;
import java.util.*;
public class BOJ_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int a = (V-A)%(A-B);
		if(a==0) System.out.println((V-A)/(A-B)+1);
		else System.out.println((V-A)/(A-B)+2);
	}
}
