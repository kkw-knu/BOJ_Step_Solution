import java.io.*;
import java.util.*;
public class BOJ_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int x=0; x<N; x++) {
			String s = br.readLine();
			char[] array = new char[s.length()];
			int[] array1 = new int[s.length()];
			int count = 0;
			int sum = 0;
			for(int a = 0; a<s.length();a++) {
				array[a] = s.charAt(a);
			}
			if(array[0]=='O') {
				count++;
				array1[0] = count;
				for(int a = 0; a<s.length()-1;a++) {
					if(array[a] == 'O'&&array[a+1]=='O') {
						count++;
						array1[a+1] = count;
					}
					else if(array[a] == 'O'&&array[a+1]=='X') {
						count = 0;
						array1[a+1] = count;
					}
					else if(array[a] == 'X'&&array[a+1]=='O') {
						count = 1;
						array1[a+1] = count;
					}
					else if(array[a] == 'X'&&array[a+1]=='X') {
						count = 0;
						array1[a+1] = count;
					}
				}
			}
			if(array[0]=='X') {
				count = 0;
				array1[0] = count;
				for(int a = 0; a<s.length()-1;a++) {
					if(array[a] == 'O'&&array[a+1]=='O') {
						count++;
						array1[a+1] = count;
					}
					else if(array[a] == 'O'&&array[a+1]=='X') {
						count = 0;
						array1[a+1] = count;
					}
					else if(array[a] == 'X'&&array[a+1]=='O') {
						count = 1;
						array1[a+1] = count;
					}
					else if(array[a] == 'X'&&array[a+1]=='X') {
						count = 0;
						array1[a+1] = count;
					}
				}
			}
			for(int a=0;a<s.length(); a++) {
				sum = sum + array1[a];			
			}
			bw.write(sum + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
