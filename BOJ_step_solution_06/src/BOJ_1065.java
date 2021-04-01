import java.io.*;
import java.util.*;
public class BOJ_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i<=n; i++) {
			if(Hansu(i)==true) count++;
		}
		System.out.println(count);
	}
	static boolean Hansu(int n) {// 참 거짓판별식
		int[] array = new int[4]; //각 자릿수에 넣기위한 배열을 만들어 줌
		array[0] = (n/1000)%10;
		array[1] = (n/100)%10;
		array[2] = (n/10)%10;
		array[3] = n%10;
		
		if(n<100) return true;
		else if(n>=100&&n<1000) {
			if(array[1]-array[2]==array[2]-array[3]) return true;
			else return false;
		}
		else if(n>=1000&&n<10000) {
			if((array[0]-array[1])==(array[1]-array[2])&&(array[1]-array[2])==(array[2]-array[3])) return true;
			else return false;
		}
		else return false;
	}
}
