import java.util.Scanner;
public class BOJ_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a;
		n = sc.nextInt();
		for(a=1;a<=9;a++) {
		System.out.println(n + " * " + a +" = " + n*a);
		}
	}
}
