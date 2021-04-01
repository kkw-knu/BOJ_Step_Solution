import java.io.*;
public class BOJ_2231 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //N 입력받음
		System.out.println(bunhae(N));
	}
	static int bunhae(int N) { //생성자를 구하는 함수 선언
		for(int a=0;a<N;a++) {
			if(sum(a)==N) return a; 
		}
		return 0;//생성자가 없는경우
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
