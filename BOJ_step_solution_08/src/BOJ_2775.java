import java.io.*;
public class BOJ_2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽� ����
		int[][] array = new int[15][14];
		for(int a = 0; a<14; a++) { //�ʱ� 0���� ���� 0���� iȣ���� i���� ����
			array[0][a] = a+1;
		}
		for(int a = 1; a<15;a++) { //����
			for(int b = 0; b<14; b++) { //ȣ��
				for(int c=0;c<=b;c++) {
					array[a][b] = array[a][b] + array[a-1][c];
				}
			}
		}
		for (int a =0; a<T; a++) {
			int k = Integer.parseInt(br.readLine()),
			n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(array[k][n-1])+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
//a���� bȣ�� ����� a-1���� 1ȣ���� bȣ���� ������� ����ŭ ��ģ ������� ����� ��ƾ� �Ѵ�.
//����Ʈ�� 0�������ְ� �������� 1ȣ���� ������ 0���� iȣ���� i���� ���.
