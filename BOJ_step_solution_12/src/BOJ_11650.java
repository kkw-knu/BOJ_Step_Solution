
import java.util.*;
import java.io.*;

public class BOJ_11650{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //�׽�Ʈ���̽� ����
		Point[] points = new Point[N]; //��ü �迭 ����
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			points[i] = new Point( //�ν��Ͻ��� ����� ���� ����
					Integer.parseInt(st.nextToken())
					,Integer.parseInt(st.nextToken()));
		}
		Comparator<Point> mycmp = new Comparator<Point>() {
			@Override //������ compare
			public int compare(Point p1, Point p2) {
				if(p1.x > p2.x) {
					return 1; //p1�� ��ü�� p2���� ũ�ٸ� �켱������ ����.
				}else if(p1.x==p2.x) {
					if(p1.y > p2.y) {
						return 1;
					}else return -1;
				}
				return -1;
			}
		};
		
		Arrays.sort(points, mycmp);
		
		for(int i = 0; i<N; i++) {
			System.out.println(points[i].x + " " + points[i].y);
		}
		
	}	
}

class Point{ //��ü ����
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}