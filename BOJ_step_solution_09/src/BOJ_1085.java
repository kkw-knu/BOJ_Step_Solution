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
}//��������.. ������ �������ΰ����Ѵٰ� ������ x,y�� 0.0 ������ �� ������ �ִٴ� ������ ����.