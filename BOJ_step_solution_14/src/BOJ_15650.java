import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class BOJ_15650 {
	
	public static int[] arr;
	public static int N,M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];//���� ������ �迭
		
		dfs(1,0);
		
	}
	
	public static void dfs(int r,int cnt) {
		if(cnt == M) { //�ִ���̱��� �������� �� ���
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println("");
			return;
		}
		
		for(int i = r; i <= N; i++) {
			arr[cnt] = i;
			if(cnt>0) if(arr[cnt]<arr[cnt-1]||arr[cnt]==arr[cnt-1]) continue;
			dfs(r+1,cnt+1);
		}
	}
}

//1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����
//�� �� ������ ���������̿��� �Ѵ�.