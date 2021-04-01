import java.io.*;
import java.util.*;
public class BOJ_1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //테스트케이스 개수
		int[] array = new int[N];
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int a = 0; a<N; a++) {
			array[a] = Integer.parseInt(st.nextToken());
			if(sosu(array[a])==1) count++; 
		}
		System.out.println(count);
		br.close();
	}
	
	static int sosu(int sosu) {
		int count = 0;
		for(int a = 1; a<=sosu; a++) {
			if((sosu%a) == 0) count++;
		}
		if (count==2) return 1;
		else return 0;
	}
}
