
import java.util.*;
import java.io.*;

public class BOJ_1181{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //테스트케이스 갯수
		String[] arr = new String[N];
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		Comparator<String> mycmp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {//글자 길이가 같다면?
					return o1.compareTo(o2);//사전순 배열
				}
				return o1.length() - o2.length();//아니라면
				//단어 길이순으로 배치
				//만약 4글자, 3글자, 5글자의 문자가 있다고 치면
				//o1.length() - o2.length() 이값을 반환하면 
				//1이라는 글자가 나와서 두 값의 위치가 바뀌게 된다.
			}
		};
		
		Arrays.sort(arr, mycmp);
		System.out.println(arr[0]);
		for(int i = 1; i<N; i++) {
			//중복값을 제거하고 출력
			if(!arr[i].equals(arr[i-1]))
				System.out.println(arr[i]);
		}
	}
	
}
