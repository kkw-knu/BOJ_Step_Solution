import java.io.*;
public class BOJ_10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(T));
		br.close();
	}
	static int fibonacci(int num) {
		if(num==0) return 0; //0��° ����
		if(num==1) return 1; //1��° ����
		return fibonacci(num - 1) + fibonacci(num -2);
	}
}
