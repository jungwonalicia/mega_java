package �迭��ȭ;

import java.util.Scanner;

public class �ּҰ�ã�� {

	public static void main(String[] args) {
		//1. ������� �ʿ�
		int[] num = new int[5];
		
		//2. 5�� �Է��� �޾Ƽ� �迭�� �ִ´�.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("���� �Է�>> ");
			num[i] = sc.nextInt();
		}
		sc.close();
		
		//�ش� �ε��������� �ּҰ��� �����صα� ����
		//�ӽú��� (min)
		int min = num[0]; 
		
		
		//�迭�� ��ȸ�ϸ鼭 �ּҰ� ã��
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("�ּҰ��� " + min);
		
		
		
	}

}
