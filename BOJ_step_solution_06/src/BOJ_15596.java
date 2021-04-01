import java.util.*;
public class BOJ_15596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] aa = new int[n];
		for(int i = 0; i<aa.length; i++) {
			aa[i] = sc.nextInt();
		}
		System.out.println(sum(aa));
	}
	static long sum(int[] a) { // 결과를 위한 함수
		long ans = 0; //합산을 저장하기 위한 변수 설정
		for(int i = 0; i<a.length; i++) { // 배열의 크기만큼 for문 실행
			ans += a[i]; // 합을 구하는 과정
		}
		return ans; // 결과값 총합 리턴
	}
}
