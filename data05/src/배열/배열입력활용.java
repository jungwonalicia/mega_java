package �迭;

import java.util.Scanner;

public class �迭�Է�Ȱ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("���� �Է�>> ");
			num[i] = sc.nextInt(); //10 20 30 40 50
		}
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
	}
}




