
import java.util.*;
import java.io.*;

public class BOJ_10814{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //테스트케이스 갯수
		User[] users = new User[N];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			users[i] = new User(
					Integer.parseInt(st.nextToken()), st.nextToken());
		}
		Comparator<User> mycmp = new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				if(o1.age>o2.age) return 1;
				else if(o1.age == o2.age) {
					return 0;				}
				return -1;
			}
		};
		
		Arrays.sort(users, mycmp);
		for(int i = 0; i<N; i++) {
				System.out.println(users[i].age + " " + users[i].name);
		}
	}
	static class User{
		int age;
		String name;
		User(int age, String name){
			this.age = age;
			this.name = name;
		}
	}
}
