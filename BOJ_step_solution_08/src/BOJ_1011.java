import java.io.*;
import java.util.*;
public class BOJ_1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽� ����
		for(int a=0;a<T;a++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken()),
			    y = Integer.parseInt(st.nextToken()); // ��ǥ���� �Է�
			int total = y-x; //�� �̵��ؾ� �ϴ� �Ÿ�
			long maximum = 0;
			int i;
			for(i = 1; maximum<total;i++) {
				maximum += (i+1)/2;
			}
			bw.write(String.valueOf(i-1)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
