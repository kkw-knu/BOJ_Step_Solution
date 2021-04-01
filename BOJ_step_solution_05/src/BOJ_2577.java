import java.io.*;
import java.util.*;
public class BOJ_2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int array[] = new int[10];
		int multiple = a * b * c;
		while(multiple > 0) {
			array[multiple%10]++;
			multiple = multiple/10;
		}
		for (int i = 0;i<10;i++) {
			System.out.println(array[i]);
		}
	}
}
