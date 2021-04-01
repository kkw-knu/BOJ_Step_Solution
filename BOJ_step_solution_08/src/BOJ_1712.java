import java.io.*;
import java.util.*;
public class BOJ_1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		long[] array = new long[3];
		st = new StringTokenizer(br.readLine()," ");
		for(int a = 0; a<3; a++) {
			array[a] = Integer.parseInt(st.nextToken());
		}
		System.out.println(break_even_point(array[0], array[1], array[2]));
	}
	static long break_even_point(long a, long b, long c) {
		long count = 1;
		if(b>=c) return -1;//가변비용이 책정가격보다 비싸면 -1리턴
		while(true) {
			if(a+(count*b)<(count*c)) return count;
			else count++;
		}
	}
}
