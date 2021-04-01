import java.io.*;
import java.util.*;
public class BOJ_1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		double[] array = new double[N];
		double max = 0;
		double sum = 0;
		st = new StringTokenizer(br.readLine()," ");
		for(int a = 0 ; a<N; a++) {
			array[a] = Integer.parseInt(st.nextToken());
			if(max<array[a]) max=array[a];
		}
		for(int a = 0; a<N ; a++) {
			double b = (array[a])/max*100;
			array[a] = Math.round(b*100)/100.0;
			sum = sum + array[a];
		}
		sum = sum/N;
		bw.write(String.valueOf(sum)+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
