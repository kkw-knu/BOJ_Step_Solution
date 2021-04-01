import java.io.*;
import java.util.*;
public class BOJ_10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String a = st.nextToken();
		String b = st.nextToken(); // 띄어쓰기로 구분하여 각각 숫자를 문자열로 할당
		int max = Math.max(a.length(), b.length());//둘중 최대값(최대 길이)을 저장
		int[] A = new int[max+1];
		int[] B = new int[max+1]; //마지막에 carry가 발생할 수도 있기 때문에 이렇게 배열을 만들어 준다.
		for(int x = a.length()-1, i = 0;x>=0; x--, i++) {
			A[i] = a.charAt(x)-'0'; // 제일 끝자리 먼저 순서대로 차곡차곡 저장 
		}
		for(int x = b.length()-1, i = 0;x>=0; x--, i++) {
			B[i] = b.charAt(x)-'0'; // -'0'을 해주는 이유는 아스키코드로 저장되기 때문에 
		}                           // -'0'을 해주면 진짜 그 숫자로 저장이 된다.
		for(int x = 0;x<max;x++) {
			int sum = A[x] + B[x];
			A[x] = sum%10; //A[x]의 값은 A[x] + B[x]값을 10으로 나눈것의 나머지가 된다. 
			A[x+1] = A[x+1] + (sum/10);//A[x+1]의 값은 A[x] + B[x]값을 10으로 나눈 몫이다.
		}
		if(A[max]!=0) System.out.print(A[max]); // 맨 앞자리가 0일수도 있기때문에 0이 아닐때만 출력
		for(int x = max-1;x>=0;x--) {
			System.out.print(A[x]);
		}
	}
}
