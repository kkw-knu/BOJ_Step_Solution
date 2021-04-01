import java.io.*;
import java.util.*;

public class BOJ_5622 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int time = 0;
		for(int a = 0; a<s.length();a++) {
			time += Timenumber(s.charAt(a));
		}
		System.out.println(time);
	}
	public static int Timenumber(char n) {
		switch(n) {
		case 'A' :
		case 'B' :
		case 'C' :
			return 3;
		case 'D' :
		case 'E' :
		case 'F' :
			return 4;
		case 'G' :
		case 'H' :
		case 'I' :
			return 5;
		case 'J' :
		case 'K' :
		case 'L' :
			return 6;
		case 'M' :
		case 'N' :
		case 'O' :
			return 7;
		case 'P' :
		case 'Q' :
		case 'R' :
		case 'S' :
			return 8;
		case 'T' :
		case 'U' :
		case 'V' :
			return 9;
		case 'W' :
		case 'X' :
		case 'Y' :
		case 'Z' :
			return 10;
		}
		return 0;
	}
}
