package �迭��ȭ;

import java.util.Scanner;

public class �ִ밪ã��2 {

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
		
		//�ش� �ε��������� �ִ밪�� �����صα� ����
		//�ӽú��� (max)
		int max = num[0]; 
		
		
		//�迭�� ��ȸ�ϸ鼭 �ִ밪 ã��
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("�ִ밪�� " + max);
		
		
		
	}

}
