import java.io.*;
import java.util.*;
public class BOJ_2292 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		System.out.println(bee(n));
	}
	static long bee(long a) {
		long count1 = 1;
		long count2 = 1;
		long b = 0;
		if(a==1) return 1;
		while(true) {
			b += 1;
			count1 += b*6;
			if(a<=count1&&count2<a) return b+1;
			count2 += b*6;
		}
	}
}
