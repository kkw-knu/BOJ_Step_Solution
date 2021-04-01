import java.io.*;
import java.util.*;
public class BOJ_2438 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i =1;i<=n;i++) {
			for (int x=1;x<=i;x++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
