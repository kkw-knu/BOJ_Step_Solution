import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649{
	public static boolean[] visit; //�湮ó���� ���� visit�迭
	public static int[] arr; //���� ���� �迭
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N]; //�� ���ڸ��� �湮ó���� ���� ���� �ʱ⿡ ��� false�� �ʱ�ȭ��
		arr = new int[M];
		dfs(N,M,0);
	}
	
	public static void dfs(int n, int m, int cnt) {//���⼭ cnt�� ���̸� ����Ѵ�.
		if(cnt==m) { //���̰� m���������� ����
			for(int i = 0; i<arr.length; i++) { //arr ���̸�ŭ i ���
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
			return; //�ְ���̱��� ������ ����ϰ� ����
		}
		
		for(int i = 0; i<n; i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[cnt] = i+1;
				dfs(n, m, cnt+1);
				visit[i]=false;
			}
			
			
			
		}
	}
}
//N�� M�� �־����� �� 1���� N���� �ڿ��� �߿��� �ߺ����� M���� �� ����