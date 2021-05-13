import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649{
	public static boolean[] visit; //방문처리를 위한 visit배열
	public static int[] arr; //수를 담을 배열
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N]; //각 숫자마다 방문처리를 위한 값임 초기에 모두 false로 초기화됨
		arr = new int[M];
		dfs(N,M,0);
	}
	
	public static void dfs(int n, int m, int cnt) {//여기서 cnt는 깊이를 얘기한다.
		if(cnt==m) { //깊이가 m과같아질때 수행
			for(int i = 0; i<arr.length; i++) { //arr 길이만큼 i 출력
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
			return; //최고깊이까지 왔을때 출력하고 리턴
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
//N과 M이 주어졌을 때 1부터 N까지 자연수 중에서 중복없이 M개를 고른 수열