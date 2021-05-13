import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class BOJ_14889 {
	public static int[][] arr; //���� ������ ���� �迭
	public static int n; // �Է¹��� ��� ��
	public static boolean[] visit;//�湮����
	static int min = Integer.MAX_VALUE;//�ּҰ��� ���ϱ����� ���α׷����� ���� ū���� �־���
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n];
		
		for(int i=0;i<n;i++) {//�迭�� �Է¹���
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<n;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0,0);
		System.out.println(min);
	}
	public static void dfs(int a, int dep) {
		if(dep == n / 2) {//���ݱ��� true���� �ָ� �� �ϼ�
			solve();
			return;
		}
		
		for(int i=a; i<n;i++) {
			if(!visit[i]) {
				visit[i]=true;
				dfs(i+1,dep+1);
				visit[i]=false;
			}
		}
	}
	public static void solve() { //true�� start�� false�� link��
		int start = 0;
		int link = 0;
 
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				// i ��° ����� j ��° ����� true��� ��ŸƮ������ ���� �÷��� 
				if (visit[i] == true && visit[j] == true) {
					start += arr[i][j];
					start += arr[j][i];
				}
				// i ��° ����� j ��° ����� false��� ��ũ������ ���� �÷��� 
				else if (visit[i] == false && visit[j] == false) {
					link += arr[i][j];
					link += arr[j][i];
				}
			}
		}
		// �� ���� ���� ���� (����)
		int val = Math.abs(start - link);
		if(val==0) {
			System.out.println(val);
			System.exit(0);
		}
		min = Math.min(val, min);		
	}
}