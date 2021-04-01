import java.io.*;
public class BOJ_10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); //�׽�Ʈ���̽� ����
		System.out.println(factorial(T));
		br.close();
	}
	static int factorial(int num) {
		if(num>1) return num * factorial(num-1);
		else return 1;
	}
}
