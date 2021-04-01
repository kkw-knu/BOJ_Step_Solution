import java.io.*;
import java.util.*;
public class BOJ_3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		double a = Math.PI*r*r;
		double b = r*r*2;
		System.out.println(String.format("%.6f", a));
		System.out.println(String.format("%.6f", b));
		br.close();
	}
}
