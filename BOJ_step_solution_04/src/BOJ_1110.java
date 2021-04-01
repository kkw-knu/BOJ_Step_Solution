import java.io.*;
import java.util.*;
public class BOJ_1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int count = 0;
		int result = a;
		int b;
		int array[] = new int[4];
		while(true) {
			if(a<10) {
				a= a*10 + a;
			}
			else if(a>=10) {
				b= a%10+(a/10)%10;
				array[0] = (a/10)%10;
				array[1] = a%10;
				if (b<10) {
					array[2] = 0;
					array[3] = b;
				}
				else if(b>=10){
					array[2] = (b/10)%10;
					array[3] = b%10;					
				}
				a= array[1]*10 + array[3];
			}
			count = count +1;
			if(a==result) {
				bw.write(String.valueOf(count));
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
