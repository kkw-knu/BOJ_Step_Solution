import java.util.*;
public class BOJ_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int a = 0;a<N;a++) { //�迭�� ������ ���ڵ��� �ִ� ����
			array[a] = sc.nextInt();
		}
		for(int i = 1;i<array.length;i++) {
			int j = i-1; //�񱳴��
			int temp = array[i];  //���ϴ� ���� ī��
			while(j>=0 && temp<array[j]) {// j�� ���� 0���� �۰� temp���� array[j]������ ũ��Ż��
				array[j+1] = array[j]; //�տ� ��� �� ū ��� ���������� �о��.
				j--;
			}
			array[j+1]=temp; //ī�ǵ� �� ����
		}
		for(int a = 0; a < N; a++) {
			System.out.println(array[a]);
			
		}
	}
}
