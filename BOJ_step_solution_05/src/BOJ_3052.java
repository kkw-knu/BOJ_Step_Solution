import java.io.*;
import java.util.*;
public class BOJ_3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10]; // ���ڸ� �Է¹ޱ����� �迭
		int array2[] = new int[10]; //����� ����� ���� �迭
		for(int a = 0; a<10; a++) { // 10���� ���� �Է�
			array[a] = sc.nextInt();
			array2[a] = array[a]%42;
		}
		int count = 0; // ���δٸ� ���ڰ� ���������� ī��Ʈ up
		for(int a = 0; a<10; a++) { 
			for(int b = 0; b<10; b++) {
				if(a==b) break;
				if(array2[a]==array2[b]) {//������ �迭�� ��
					array2[b]=-1; //�迭�� ���ڰ� ������ -������ �ʱ�ȭ�ع��� 0���� �ʱ�ȭ���� ������ �������� 0�ϼ��� �ֱ� ����
				}
			}
		}
		for(int a = 0; a<10; a++) {
			if(array2[a] != -1) {
				count++;			
			}
		}
		System.out.println(count);
	}
}
