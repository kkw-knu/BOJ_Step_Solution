import java.io.*;
public class BOJ_2231 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //N �Է¹���
		System.out.println(bunhae(N));
	}
	static int bunhae(int N) { //�����ڸ� ���ϴ� �Լ� ����
		for(int a=0;a<N;a++) {
			if(sum(a)==N) return a; 
		}
		return 0;//�����ڰ� ���°��
	}
	static int sum(int a){
		int save = a;
		int sum = a;
		while(save>0) {
			sum = sum+save%10;
			save /= 10;
		}
		return sum;
	}
}
