import java.util.Scanner;
public class BOJ_14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();

		if(x>0) {
			if(y>0) System.out.println(1);
			else System.out.println(4);	
		}
		if(x<0) {
			if(y>0) System.out.println(2);
			else System.out.println(3);	
		}
	}

}