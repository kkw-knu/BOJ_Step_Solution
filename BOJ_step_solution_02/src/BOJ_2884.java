import java.util.Scanner;
public class BOJ_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m;
		h = sc.nextInt();
		m = sc.nextInt();
		if(m-45<0) {
			if(h-1<0) {
				System.out.println(23);
				System.out.println(m+15);
			}
			else {
				System.out.println(h-1);
				System.out.println(m+15);
			}
		}else {
			System.out.println(h);
			System.out.println(m-45);
		}
	}
}
