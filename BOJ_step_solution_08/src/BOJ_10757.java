import java.io.*;
import java.util.*;
public class BOJ_10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String a = st.nextToken();
		String b = st.nextToken(); // ����� �����Ͽ� ���� ���ڸ� ���ڿ��� �Ҵ�
		int max = Math.max(a.length(), b.length());//���� �ִ밪(�ִ� ����)�� ����
		int[] A = new int[max+1];
		int[] B = new int[max+1]; //�������� carry�� �߻��� ���� �ֱ� ������ �̷��� �迭�� ����� �ش�.
		for(int x = a.length()-1, i = 0;x>=0; x--, i++) {
			A[i] = a.charAt(x)-'0'; // ���� ���ڸ� ���� ������� �������� ���� 
		}
		for(int x = b.length()-1, i = 0;x>=0; x--, i++) {
			B[i] = b.charAt(x)-'0'; // -'0'�� ���ִ� ������ �ƽ�Ű�ڵ�� ����Ǳ� ������ 
		}                           // -'0'�� ���ָ� ��¥ �� ���ڷ� ������ �ȴ�.
		for(int x = 0;x<max;x++) {
			int sum = A[x] + B[x];
			A[x] = sum%10; //A[x]�� ���� A[x] + B[x]���� 10���� �������� �������� �ȴ�. 
			A[x+1] = A[x+1] + (sum/10);//A[x+1]�� ���� A[x] + B[x]���� 10���� ���� ���̴�.
		}
		if(A[max]!=0) System.out.print(A[max]); // �� ���ڸ��� 0�ϼ��� �ֱ⶧���� 0�� �ƴҶ��� ���
		for(int x = max-1;x>=0;x--) {
			System.out.print(A[x]);
		}
	}
}
