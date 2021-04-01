import java.io.*;
import java.util.*;
public class BOJ_11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //N
		while(true) {
			if(N==1)break;
			else {
				for(int a = 2; a<=N; a++) {
					if(N%a==0) {
						System.out.println(a);
						N = N/a;
						break;
					}
				}
			}
		}
		br.close();
	}
}
