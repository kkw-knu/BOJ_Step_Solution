import java.io.*;
import java.util.*;
public class BOJ_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int array[] = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for (int a=0; a<N; a++) {
			array[a] = Integer.parseInt(st.nextToken());
		}
		int max = array[0];
		int min = array[0];
		for (int a=0; a<N-1; a++) {
			if(max > array[a+1]) {
				max = max;
			}
			if(max < array[a+1]) {
				max = array[a+1];
			}
		}
		for (int a=0; a<N-1; a++) {
			if(min > array[a+1]) {
				min = array[a+1];
			}
			if(min < array[a+1]) {
				min = min;
			}
		}
		bw.write(min + " " + max);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
