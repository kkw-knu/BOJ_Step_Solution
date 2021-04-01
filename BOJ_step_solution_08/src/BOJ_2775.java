import java.io.*;
public class BOJ_2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수
		int[][] array = new int[15][14];
		for(int a = 0; a<14; a++) { //초기 0층의 설정 0층의 i호에는 i명이 거주
			array[0][a] = a+1;
		}
		for(int a = 1; a<15;a++) { //층수
			for(int b = 0; b<14; b++) { //호수
				for(int c=0;c<=b;c++) {
					array[a][b] = array[a][b] + array[a-1][c];
				}
			}
		}
		for (int a =0; a<T; a++) {
			int k = Integer.parseInt(br.readLine()),
			n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(array[k][n-1])+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
//a층의 b호에 살려면 a-1층의 1호부터 b호까지 사람들의 수만큼 합친 사람들을 대려와 살아야 한다.
//아파트는 0층부터있고 각층에는 1호부터 있으며 0층의 i호에는 i명이 산다.
