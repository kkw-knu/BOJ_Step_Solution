import java.io.*;
import java.util.*;
public class BOJ_7568 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //사람의 수
		int[] array_cm = new int[N]; //키에대한 배열 저장
		int[] array_kg = new int[N]; //몸무게에 대한 배열 저장
		int[] array_st = new int[N]; //등수에 관한 저장
		Arrays.fill(array_st,1);//값을 1로 초기화 -> 모두 1등으로 시작
		StringTokenizer st;
		for(int i=0;i<N;i++) {//사람 수만큼 for문 각각 몸무게 키 저장
			st = new StringTokenizer(br.readLine()," ");
			array_kg[i]=Integer.parseInt(st.nextToken());
			array_cm[i]=Integer.parseInt(st.nextToken());
		}
		for(int a=0;a<N;a++) {// 비교
			for(int b=0;b<N;b++) {
				if(a==b) continue; //자기 자신과 비교할 때는 넘김
				if(array_kg[a]<array_kg[b]&&array_cm[a]<array_cm[b]) {
					array_st[a]++;//등수가 떨어짐
				}
			}
		}
		for(int a=0;a<N;a++) {
			System.out.print(array_st[a]+" ");			
		}
	}
}
