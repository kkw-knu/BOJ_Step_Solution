import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class BOJ_14888 {
	public static int[] arr;
	public static int[] arithmetic = new int[4];
	public static int max = -1000000000;
	public static int min = 1000000000;
	public static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];//������ ���� �迭 ����
		
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++) {//���� �Է¹���
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<4;i++) {//��Ģ���� �Է¹��� 0 1 2 3 ������ + - x /
			arithmetic[i] = Integer.parseInt(st2.nextToken());
		}
		
		dfs(arr[0],1);
		System.out.println(max);
		System.out.println(min);
		
	}
	
	public static void dfs(int num, int cnt) {
		if(cnt==n) {
			max = Math.max(num, max);
			min = Math.min(num, min);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(arithmetic[i]>0) {
				arithmetic[i]--;
				
				switch(i) {
				case 0: dfs(num + arr[cnt], cnt+1); break;
				case 1: dfs(num - arr[cnt], cnt+1); break;
				case 2: dfs(num * arr[cnt], cnt+1); break;
				case 3: dfs(num / arr[cnt], cnt+1); break;
				}
				arithmetic[i]++;
			}
		}
	}
}