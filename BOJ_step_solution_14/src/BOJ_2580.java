import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2580{
	public static int[][] arr = new int[9][9];
	public static int cnt=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i<9; i++) { //�迭�� ä��� ����
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0);
	}
	
	
	public static void dfs(int row, int col) {
		if(col==9) {//���� �� ä������ ��� ���� ���� ù ���� ȣ��
			dfs(row + 1, 0);
			return;
		}
		
		if(row==9) {//�࿭�� ��� ä���� ��� ����Ʈ
			for(int i = 0; i<9; i++) {
				for(int j = 0; j<9; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			System.exit(0); //�ϳ��� ����ѵ� �ý��� Ż��
		}
		//----------------------------------��������� Ż������
		if(arr[row][col]==0) {//���� �����ִ� ���� 0�̶��?
			for(int i = 1; i<=9; i++) {
				if(check(row,col,i)) {
					arr[row][col] = i;
					dfs(row, col + 1);
				}
			}
			arr[row][col] = 0; //����̹Ƿ� ���� ���� ���� �ʱ�ȭ���ش�
			return;
		}
		dfs(row,col+1);
	}
	
	public static boolean check(int row, int col, int value) { //���� ��, ��, 3x3�࿭�� �ߺ��� Ȯ��
		
		for(int i=0;i<9;i++) {//���� �࿡ ���� �ִ��� Ȯ��
			if(arr[row][i] == value) return false;
		}
		
		for(int i=0;i<9;i++) {//���� ���� ���� �ִ��� Ȯ��
			if(arr[i][col] == value) return false;
		}
		
		int row_1 = (row/3)*3; //���� ���� ���Ե� 3x3����� ù�� ��ġ
		int col_1 = (col/3)*3; //���� ���� ���Ե� 3x3����� ù�� ��ġ
		
		for(int i = row_1; i<row_1 +3; i++) {
			for(int j = col_1; j<col_1+3;j++) {
				if(arr[i][j]==value) return false;
			}
		}
		return true;
	}
}