import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class BOJ_15651 {
	public static int[] arr;
	public static int N,M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];//값을 저장할 배열
		dfs(0);
		System.out.println(sb);
	}
	
	public static void dfs(int cnt) {
		if(cnt == M) { //최대깊이까지 도달했을 때 출력
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			arr[cnt] = i;
			dfs(cnt+1);
		}
	}
}