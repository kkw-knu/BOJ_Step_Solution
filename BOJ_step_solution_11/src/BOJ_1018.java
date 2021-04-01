import java.io.*;
import java.util.*;
public class BOJ_1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");//N M을 입력받기위함
		int N = Integer.parseInt(st.nextToken()); //세로
		int M = Integer.parseInt(st.nextToken()); //가로
		String[] chess_1 = {"WBWBWBWB", "BWBWBWBW"};
		String[] chess_2 = {"BWBWBWBW", "WBWBWBWB"};//비교하기 위함
		String[] array = new String[N];
		for(int i=0;i<N;i++) {
			array[i] = br.readLine(); //한줄씩 선언
		}
		int count_min = 64;
		for(int a=0;a<N-7;a++) {
			for(int b=0;b<M-7;b++) {
				int count_1 = 0;
				int count_2 = 0;
				for(int x = 0; x< 8; x++) {
					String save = array[a+x].substring(b,b+8);
					for(int y=0;y<8;y++) {
						if(save.charAt(y)!=chess_1[x%2].charAt(y)) count_1++;
						if(save.charAt(y)!=chess_2[x%2].charAt(y)) count_2++;
					}
				}
				
				count_min=Math.min(count_min, Math.min(count_1, count_2));
			}
		}
		System.out.println(count_min);
	}
}
