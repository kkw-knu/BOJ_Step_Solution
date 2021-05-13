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
    	//���� row���� ���� row���� ������ �˻�
		for(int i=0;i<row;i++) {
        	//���� col , �밢���� ��ġ�� ��� return false
			if(arr[i] == arr[row] || (row - i) == Math.abs(arr[i] - arr[row])) {
				return false;
			}
		}
		return true;
	}
	static void dfs(int row) {
    	//ü������ ������ ���ٸ� ��� ���� �� ���Ҵٴ� �ǹ�
		if(row >= N) {
			count++;
			return;
		}
        //�� col���� ���� ���ƺ��� üũ
		for(int col=0;col<N;col++) {
			arr[row] = col;
			
			if(check(row)) {
				dfs(row+1);
			}
		}
	}
}