import java.io.*;
import java.util.*;
public class BOJ_2839 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		while(true) {
			if(N%5==0) {
				System.out.println(N/5 +count);
				break;
			}
			else if(N<=0) {
				System.out.println(-1);
				break;
			}
			N-=3;
			count +=1;
		}
	}
}
