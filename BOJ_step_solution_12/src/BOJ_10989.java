import java.io.*;

public class BOJ_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[10001];
		for(int i = 0; i < N; i++) {
			array[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<10001;i++) {
			while(array[i]>0) {
				sb.append(i).append("\n");
				array[i]--;
			}
		}
		System.out.print(sb);
	}
}