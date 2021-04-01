import java.io.*;
import java.util.*;
public class BOJ_1193 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		System.out.println(bunja(n)+"/"+bunmo(n));
	}
	
	static long bunmo(long N) {
		long b = 1;
		long count1 = 0;
		long count2 = 1;
		if(N==1) return 1;
		while(true) {
			count1+=1;;
			while(true) {
				b+=1;
				count2+=1;
				if(N==count2) return b;
				if(b==2*count1) break;
			}
			while(true) {
				b-=1;
				count2+=1;
				if(N==count2) return b;
				if(b==1) {
					count2+=1;
					if(N==count2) return b;
					break;
				}
			}
		}
	}
	static long bunja(long N) {
		long b = 0;
		long count1 = 0;
		long count2 = 1;
		if(N==1) return 1;
		while(true) {
			count1+=1;;
			while(true) {
				b+=1;
				count2+=1;
				if(N==count2) return b;
				if(b==(2*count1)+1) break;
			}
			while(true) {
				b-=1;
				count2+=1;
				if(N==count2) return b;
				if(b==1) {
					count2+=1;
					if(N==count2) return b;
					break;
				}
			}
		}
	}
}
