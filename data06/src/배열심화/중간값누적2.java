package �迭��ȭ;

import java.util.ArrayList;

public class �߰�������2 {

	public static void main(String[] args) {
		//1~100������ �� �߿��� ¦���� ���ؼ� �迭�� �־�ô�.
		ArrayList even = new ArrayList();
		
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) { //%�� ������ ������.
				even.add(i);
			}
		}
		System.out.println(even);
		System.out.println(even.size());
	}
}
