import java.util.Scanner;
public class BOJ_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x;
		int sum=0;
		n = sc.nextInt();
		for(x=1;x<=n;x++) {
			sum = sum + x;
		}
		System.out.println(sum);
	}
}
