import java.io.*;
import java.util.*;
public class BOJ_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int a = Math.min((w-x), (h-y));
		int b = Math.min(x, y);
		System.out.println(Math.min(a, b));
		br.close();

	}
}//간과한점.. 무조건 위쪽으로가야한다고 생각함 x,y가 0.0 지점에 더 가까울수 있다는 생각을 못함.