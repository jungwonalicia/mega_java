package �迭;

import java.util.Scanner;

public class �迭����ã�� {

	public static void main(String[] args) {
		int[] num = { 1, 5, 2, 9, 7 };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ã���� �ϴ� ���� : ");
		int target = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == target) {
				System.out.println(target + "��(��) �ִ� ��ġ�� : " + i );
			}
		}
		sc.close();
	}
}
