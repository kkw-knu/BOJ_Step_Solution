import java.io.*;
import java.util.*;
public class BOJ_3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arrayx = new int[4];
		int[] arrayy = new int[4];
		for(int a = 0; a<3; a++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arrayx[a] = Integer.parseInt(st.nextToken());
			arrayy[a] = Integer.parseInt(st.nextToken());
		}
		if(arrayx[0]==arrayx[1]) arrayx[3] = arrayx[2];
		else if(arrayx[1]==arrayx[2]) arrayx[3] = arrayx[0];
		else arrayx[3] = arrayx[1];
		if(arrayy[0]==arrayy[1]) arrayy[3] = arrayy[2];
		else if(arrayy[1]==arrayy[2]) arrayy[3] = arrayy[0];
		else arrayy[3] = arrayy[1];
		System.out.println(arrayx[3] +" "+arrayy[3]);
		br.close();

	}
}
