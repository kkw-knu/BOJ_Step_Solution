import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class BOJ_15652 {
	public static boolean[] visit;
	public static int[] arr;
	public static int N,M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N];
		arr = new int[M];//값을 저장할 배열
		
		dfs(0,0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int r,int cnt) {
		if(cnt == M) { //최대깊이까지 도달했을 때 출력
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			arr[cnt] = i+1;
			if(cnt>0) if(arr[cnt]<arr[cnt-1]) continue;
			dfs(r+1,cnt+1);
		
		}
	}
}