import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class BOJ_14889 {
	public static int[][] arr; //조합 점수를 위한 배열
	public static int n; // 입력받을 사람 수
	public static boolean[] visit;//방문여부
	static int min = Integer.MAX_VALUE;//최소값을 구하기위해 프로그램에서 가장 큰값을 넣어줌
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n];
		
		for(int i=0;i<n;i++) {//배열을 입력받음
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<n;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0,0);
		System.out.println(min);
	}
	public static void dfs(int a, int dep) {
		if(dep == n / 2) {//절반까지 true값을 주면 팀 완성
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
	public static void solve() { //true를 start팀 false를 link팀
		int start = 0;
		int link = 0;
 
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				// i 번째 사람과 j 번째 사람이 true라면 스타트팀으로 점수 플러스 
				if (visit[i] == true && visit[j] == true) {
					start += arr[i][j];
					start += arr[j][i];
				}
				// i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스 
				else if (visit[i] == false && visit[j] == false) {
					link += arr[i][j];
					link += arr[j][i];
				}
			}
		}
		// 두 팀의 점수 차이 (절댓값)
		int val = Math.abs(start - link);
		if(val==0) {
			System.out.println(val);
			System.exit(0);
		}
		min = Math.min(val, min);		
	}
}