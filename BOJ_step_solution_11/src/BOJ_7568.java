import java.io.*;
import java.util.*;
public class BOJ_7568 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //����� ��
		int[] array_cm = new int[N]; //Ű������ �迭 ����
		int[] array_kg = new int[N]; //�����Կ� ���� �迭 ����
		int[] array_st = new int[N]; //����� ���� ����
		Arrays.fill(array_st,1);//���� 1�� �ʱ�ȭ -> ��� 1������ ����
		StringTokenizer st;
		for(int i=0;i<N;i++) {//��� ����ŭ for�� ���� ������ Ű ����
			st = new StringTokenizer(br.readLine()," ");
			array_kg[i]=Integer.parseInt(st.nextToken());
			array_cm[i]=Integer.parseInt(st.nextToken());
		}
		for(int a=0;a<N;a++) {// ��
			for(int b=0;b<N;b++) {
				if(a==b) continue; //�ڱ� �ڽŰ� ���� ���� �ѱ�
				if(array_kg[a]<array_kg[b]&&array_cm[a]<array_cm[b]) {
					array_st[a]++;//����� ������
				}
			}
		}
		for(int a=0;a<N;a++) {
			System.out.print(array_st[a]+" ");			
		}
	}
}
