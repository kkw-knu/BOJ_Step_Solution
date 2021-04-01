import java.io.*;
import java.util.*;
public class BOJ_3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10]; // 숫자를 입력받기위한 배열
		int array2[] = new int[10]; //결과값 계산을 위한 배열
		for(int a = 0; a<10; a++) { // 10개의 숫자 입력
			array[a] = sc.nextInt();
			array2[a] = array[a]%42;
		}
		int count = 0; // 서로다른 숫자가 있을때마다 카운트 up
		for(int a = 0; a<10; a++) { 
			for(int b = 0; b<10; b++) {
				if(a==b) break;
				if(array2[a]==array2[b]) {//각각의 배열을 비교
					array2[b]=-1; //배열에 숫자가 같으면 -값으로 초기화해버림 0으로 초기화안한 이유는 나머지가 0일수도 있기 때문
				}
			}
		}
		for(int a = 0; a<10; a++) {
			if(array2[a] != -1) {
				count++;			
			}
		}
		System.out.println(count);
	}
}
