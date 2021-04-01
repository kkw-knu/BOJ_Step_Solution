import java.io.*;
import java.util.*;

public class BOJ_2941 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] array = new char[s.length()];
		int length = s.length();
		for(int a = 0;a<s.length();a++) {
			array[a] = s.charAt(a);
		}
		for(int a = 0;a<s.length()-1;a++) {
			length -= croatia(array[a],array[a+1]);
		}
		for(int a = 0;a<s.length()-2;a++) {
			length -= croatia1(array[a],array[a+1],array[a+2]);
		}
		System.out.println(length);
	}
	public static int croatia(char a,char b) {
		if(a=='c'&&b=='=') return 1;
		else if(a=='c'&&b=='-') return 1;
		else if(a=='d'&&b=='-') return 1;
		else if(a=='l'&&b=='j') return 1;
		else if(a=='n'&&b=='j') return 1;
		else if(a=='s'&&b=='=') return 1;
		else if(a=='z'&&b=='=') return 1;
		else return 0;
	}
	public static int croatia1(char a,char b,char c) {
		if(a=='d'&&b=='z'&&c=='=') return 1;
		else return 0;
	}
}
