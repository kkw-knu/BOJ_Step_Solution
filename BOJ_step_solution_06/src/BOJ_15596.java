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
	static long sum(int[] a) { // ����� ���� �Լ�
		long ans = 0; //�ջ��� �����ϱ� ���� ���� ����
		for(int i = 0; i<a.length; i++) { // �迭�� ũ�⸸ŭ for�� ����
			ans += a[i]; // ���� ���ϴ� ����
		}
		return ans; // ����� ���� ����
	}
}
