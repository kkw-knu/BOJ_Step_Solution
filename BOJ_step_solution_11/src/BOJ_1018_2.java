import java.io.*;
import java.util.*;
public class BOJ_1018_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");//N M�� �Է¹ޱ�����
		int N = Integer.parseInt(st.nextToken()); //����
		int M = Integer.parseInt(st.nextToken()); //����
		char[][] array = new char[N][M]; //�迭 ����
		char[][] array_backup = new char [N][M]; //����迭 ����
		for(int i=0;i<N;i++) {//���ο� ���� �Է�
			String s = br.readLine(); //���پ� �Է¹ޱ�
			for(int j=0;j<M;j++) {//���ο� ���� �Է�
				array[i][j] = s.charAt(j);
				array_backup[i][j] = s.charAt(j); //�������
			}
		}
		int count_min=64;
		
		int end_width = M-8;//������ ������ �������� üŷ
		int end_heigth = N-8;//������ ������ �������� üŷ 8x8�� ã�ƾ��ϹǷ� �Ѿ�� �ȵȴ�.
		for(int a=0;a<=end_heigth;a++) {
			for(int b=0;b<=end_width;b++) {
				for(int c=0;c<2;c++) {
					int count = 0;
					if(c==0) {
						array[a][b] = 'B';
						if(array[a][b]!=array_backup[a][b]) count++;
					}
					if(c==1) {
						array[a][b] = 'W';
						if(array[a][b]!=array_backup[a][b]) count++;
					}
				for(int x=a;x<a+8;x++) { //8x8�� ����
					if(x==a) {
						for(int y=b+1;y<b+8;y++) { //8x8�� ����
							if(array[x][y]==array[x][y-1]) {
								if(array[x][y-1]=='B') array[x][y] = 'W';//����ĭ�� ���� Ȯ���ϴ� ��
								else array[x][y] ='B';
								
								count++;
							}
						}
					}
					if(x!=a) {
						for(int y=b;y<b+8;y++) {
							if(array[x-1][y]==array[x][y]) {
								if(array[x-1][y]=='B') array[x][y] ='W';
								else array[x][y] ='B';
								
								count++;
							}
						}
					 }
				}
				count_min=(int)Math.min(count, count_min);
				for(int i=0; i<N;i++) { //�迭 ���󺹱�
					for(int j=0; j<M;j++) {
						array[i][j] = array_backup[i][j];
					}
				}
			}
			}
		}
		System.out.println(count_min);
	}
}
