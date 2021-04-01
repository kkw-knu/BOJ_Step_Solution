import java.io.*;
import java.util.*;
public class BOJ_4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] array = new int[1001];
		for(int a= 0 ; a < C; a++) {
			double sum = 0;
			double avg = 0;
			double count = 0;
			double per;
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			array[0] = x;
			for(int b = 1; b <=x; b++) {
				array[b] = Integer.parseInt(st.nextToken());
			}
			for(int b = 1; b<=x; b++) {
				sum = sum + array[b];
			}
			avg = sum/x;
			for(int b = 1; b<=x; b++) {
				if(array[b]>avg) count++;
			}
			per = count/x*100;
			bw.write(String.format("%.3f", per) + "%\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
