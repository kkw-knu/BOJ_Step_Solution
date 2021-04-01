import java.io.*;
import java.util.*;
public class BOJ_1018_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");//N M을 입력받기위함
		int N = Integer.parseInt(st.nextToken()); //세로
		int M = Integer.parseInt(st.nextToken()); //가로
		char[][] array = new char[N][M]; //배열 선언
		char[][] array_backup = new char [N][M]; //백업배열 선언
		for(int i=0;i<N;i++) {//세로에 대한 입력
			String s = br.readLine(); //한줄씩 입력받기
			for(int j=0;j<M;j++) {//가로에 대한 입력
				array[i][j] = s.charAt(j);
				array_backup[i][j] = s.charAt(j); //백업과정
			}
		}
		int count_min=64;
		
		int end_width = M-8;//가로의 마지막 시작지점 체킹
		int end_heigth = N-8;//세로의 마지막 시작지점 체킹 8x8만 찾아야하므로 넘어가면 안된다.
		for(int a=0;a<=end_heigth;a++) {
			for(int b=0;b<=end_width;b++) {
				for(int c=0;c<2;c++) {
					int count = 0;
					if(c==0) {
						array[a][b] = 'B';
						if(array[a][b]!=array_backup[a][b]) count++;
					}
					if(c==1) {
						array[a][b] = 'W';
						if(array[a][b]!=array_backup[a][b]) count++;
					}
				for(int x=a;x<a+8;x++) { //8x8의 세로
					if(x==a) {
						for(int y=b+1;y<b+8;y++) { //8x8의 가로
							if(array[x][y]==array[x][y-1]) {
								if(array[x][y-1]=='B') array[x][y] = 'W';//그전칸이 뭔지 확인하는 것
								else array[x][y] ='B';
								
								count++;
							}
						}
					}
					if(x!=a) {
						for(int y=b;y<b+8;y++) {
							if(array[x-1][y]==array[x][y]) {
								if(array[x-1][y]=='B') array[x][y] ='W';
								else array[x][y] ='B';
								
								count++;
							}
						}
					 }
				}
				count_min=(int)Math.min(count, count_min);
				for(int i=0; i<N;i++) { //배열 원상복귀
					for(int j=0; j<M;j++) {
						array[i][j] = array_backup[i][j];
					}
				}
			}
			}
		}
		System.out.println(count_min);
	}
}
