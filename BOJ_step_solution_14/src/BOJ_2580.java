import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2580{
	public static int[][] arr = new int[9][9];
	public static int cnt=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i<9; i++) { //배열을 채우는 과정
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0);
	}
	
	
	public static void dfs(int row, int col) {
		if(col==9) {//행이 다 채워졌을 경우 다음 행의 첫 열을 호출
			dfs(row + 1, 0);
			return;
		}
		
		if(row==9) {//행열이 모두 채워질 경우 프린트
			for(int i = 0; i<9; i++) {
				for(int j = 0; j<9; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			System.exit(0); //하나를 출력한뒤 시스템 탈출
		}
		//----------------------------------여기까지가 탈출조건
		if(arr[row][col]==0) {//만약 여기있는 값이 0이라면?
			for(int i = 1; i<=9; i++) {
				if(check(row,col,i)) {
					arr[row][col] = i;
					dfs(row, col + 1);
				}
			}
			arr[row][col] = 0; //재귀이므로 다음 값을 위해 초기화해준다
			return;
		}
		dfs(row,col+1);
	}
	
	public static boolean check(int row, int col, int value) { //같은 행, 열, 3x3행열에 중복값 확인
		
		for(int i=0;i<9;i++) {//같은 행에 값이 있는지 확인
			if(arr[row][i] == value) return false;
		}
		
		for(int i=0;i<9;i++) {//같은 열에 값이 있는지 확인
			if(arr[i][col] == value) return false;
		}
		
		int row_1 = (row/3)*3; //현재 값이 포함된 3x3행렬의 첫행 위치
		int col_1 = (col/3)*3; //현재 값이 포함된 3x3행렬의 첫열 위치
		
		for(int i = row_1; i<row_1 +3; i++) {
			for(int j = col_1; j<col_1+3;j++) {
				if(arr[i][j]==value) return false;
			}
		}
		return true;
	}
}