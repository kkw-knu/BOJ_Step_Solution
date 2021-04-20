
import java.util.*;
import java.io.*;

public class BOJ_11650{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //테스트케이스 갯수
		Point[] points = new Point[N]; //객체 배열 생성
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			points[i] = new Point( //인스턴스를 만들어 값을 넣음
					Integer.parseInt(st.nextToken())
					,Integer.parseInt(st.nextToken()));
		}
		Comparator<Point> mycmp = new Comparator<Point>() {
			@Override //재정의 compare
			public int compare(Point p1, Point p2) {
				if(p1.x > p2.x) {
					return 1; //p1의 객체가 p2보다 크다면 우선순위가 높다.
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

class Point{ //객체 생성
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}