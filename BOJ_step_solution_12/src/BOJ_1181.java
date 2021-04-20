
import java.util.*;
import java.io.*;

public class BOJ_1181{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //�׽�Ʈ���̽� ����
		String[] arr = new String[N];
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		Comparator<String> mycmp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {//���� ���̰� ���ٸ�?
					return o1.compareTo(o2);//������ �迭
				}
				return o1.length() - o2.length();//�ƴ϶��
				//�ܾ� ���̼����� ��ġ
				//���� 4����, 3����, 5������ ���ڰ� �ִٰ� ġ��
				//o1.length() - o2.length() �̰��� ��ȯ�ϸ� 
				//1�̶�� ���ڰ� ���ͼ� �� ���� ��ġ�� �ٲ�� �ȴ�.
			}
		};
		
		Arrays.sort(arr, mycmp);
		System.out.println(arr[0]);
		for(int i = 1; i<N; i++) {
			//�ߺ����� �����ϰ� ���
			if(!arr[i].equals(arr[i-1]))
				System.out.println(arr[i]);
		}
	}
	
}
