import java.io.*;
import java.util.*;
public class BOJ_1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); //�׽�Ʈ���̽� ����
		for (int a = 0; a<T; a++) {
			st = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(circle(x1,y1,r1,x2,y2,r2))+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	static int circle(int x1, int y1, int r1, int x2, int y2, int r2) {
		int pointToPoint= (int)(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)); //���� �������� �Ÿ�
		
		//������ ���� ��
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		//������ 0�϶� 1)���� ���� �ָ� ������
		else if(pointToPoint > Math.pow(r1 + r2, 2)) {
			return 0;
		}
		//������ 0�϶� 2)���� ���ȿ� ������ ������ ������
		else if(pointToPoint < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		//������ 1�϶� 1)�����Ҷ�
		else if(pointToPoint == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		//������ 1�϶� 2)�����Ҷ�
		else if(pointToPoint == Math.pow(r2 - r1, 2)) {
			return 1;
		}
		else return 2; //�� �ܿ��� ������ ��� �ΰ�
	}
}
