import java.io.*;
import java.util.*;
public class BOJ_2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = 0;
		int count=0;
		int array[] = new int[9];
		for(int a = 0;a<9;a++) {
			array[a] = Integer.parseInt(br.readLine());
			if(array[a]>max) {
				max = array[a];
				count = a+1;
			}
		}

		bw.write(String.valueOf(max) + "\n" + count);
		br.close();
		bw.flush();
		bw.close();
	}
}
