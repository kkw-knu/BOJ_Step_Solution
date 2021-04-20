
import java.util.*;
import java.io.*;

public class BOJ_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine(); //���� �Է¹���
		int[] array = new int[N.length()]; //N�� ���̸�ŭ  �迭�� ����
		
		for(int i = 0; i < N.length(); i++) {
			array[i] = (int)(N.charAt(i)-'0');
		}
		Arrays.sort(array);
		
		int[] temp = new int[array.length];
		for(int i = 0, j = array.length-1; i<array.length; i++, j--) {
			temp[i] = array[j];
		}
		for(int i = 0; i < N.length(); i++) {
			System.out.print(temp[i]);
		}
	}
	
}
