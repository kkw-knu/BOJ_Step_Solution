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
		
		arr = new int[M];//값을 저장할 배열
		
		dfs(1,0);
		
	}
	
	public static void dfs(int r,int cnt) {
		if(cnt == M) { //최대깊이까지 도달했을 때 출력
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

//1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
//단 고른 수열은 오름차순이여야 한다.