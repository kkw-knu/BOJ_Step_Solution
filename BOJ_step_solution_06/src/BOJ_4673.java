public class BOJ_4673 {
	public static void main(String[] args) {
		for(int a = 1; a<=10000; a++) {
			if(Selfnum(a)==true) System.out.println(a);
		}
	}
	static boolean Selfnum(int n) {// Âü °ÅÁþ
		boolean result = true;
		for(int a = 1; a<n; a++) {
			int mod = a;
			int sum = a;
			while(mod>0) {
				sum += mod%10;
				mod /= 10;
			}
			if(n==sum) {
				result = false;
				break;
			}
		}
		return result;
	}
}
