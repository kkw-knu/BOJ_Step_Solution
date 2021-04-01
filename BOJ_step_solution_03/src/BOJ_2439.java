import java.io.*;
import java.util.*;
public class BOJ_2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i =n;i>=1;i--) {
			for (int x=1;x<=i-1;x++) {
				System.out.print(" ");
			}
			for (int y=i;y<=n;y++) {
				System.out.print("*");
			}
		
		System.out.print("\n");
		}
	}
}
