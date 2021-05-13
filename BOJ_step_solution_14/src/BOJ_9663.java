import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9663{
	public static int[] arr;
	public static int N;
	public static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); 
		count = 0;
		arr = new int[N];
		dfs(0);
		System.out.println(count);
	}
	
	static boolean check(int row) {
    	//현재 row보다 이전 row들의 퀸들을 검사
		for(int i=0;i<row;i++) {
        	//같은 col , 대각선에 위치할 경우 return false
			if(arr[i] == arr[row] || (row - i) == Math.abs(arr[i] - arr[row])) {
				return false;
			}
		}
		return true;
	}
	static void dfs(int row) {
    	//체스판의 끝까지 갔다면 모든 퀸을 다 놓았다는 의미
		if(row >= N) {
			count++;
			return;
		}
        //각 col마다 퀸을 놓아보고 체크
		for(int col=0;col<N;col++) {
			arr[row] = col;
			
			if(check(row)) {
				dfs(row+1);
			}
		}
	}
}