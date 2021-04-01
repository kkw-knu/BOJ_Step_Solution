import java.io.*;
import java.util.*;
public class BOJ_2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()); //M
		int N = Integer.parseInt(br.readLine()); //N
		int count = 0;
		int sum = 0;
		int min = 10001;
		for (int a = M; a<=N; a++) {
			if(sosu(a)==1) {
				sum += a;
				if(min>a) min=a;
			}
		}
		if(sum==0) System.out.println(-1);
		else System.out.println(sum +"\n"+min);
		br.close();
	}
	
	static int sosu(int sosu) {
		int count = 0;
		for(int a = 1; a<=sosu; a++) {
			if((sosu%a) == 0) count++;
		}
		if (count==2) return 1;
		else return 0;
	}
}
