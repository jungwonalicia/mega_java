package ���;

import java.util.Random;
import java.util.Scanner;

public class �Է��׽�Ʈ3 {

	public static void main(String[] args) {
		// ������ int���� �߻����Ѿ���.
		// ������ �� �߻���ų �� �ִ� Random Ŭ���� �ʿ�
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num = r.nextInt(100); // 0~99
		int target = num;
		int count = 0; //�õ�Ƚ��
		
		while (true) {
			//count++; //����������, count = count + 1;
			System.out.print("����� �����ϴ� ���ڴ�(���� -1)>> ");
			int think = sc.nextInt();
			if (think == -1) {
				System.out.println("�ý��� ����");
				break;
				//System.exit(0);
			}
			count++;
			if (target == think) {
				System.out.println("�õ��� Ƚ���� " + count + "ȸ.");
				System.out.println("������ Ƚ���� " + (count -1) + "ȸ");
				System.out.println("�����Դϴ�. ���ϵ帳�ϴ�.");
				System.out.println("�ý��� ����");
				break;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				// ��Ʈ�� �ּ���.!
				// ���亸�� ������ ���� ������ �ʹ� ���ƿ�!
				// ���亸�� ������ ���� ������ �ʹ� ���ƿ�!
				if (target < think) {
					System.out.println("�ʹ� ���ƿ�!");
				} else {
					System.out.println("�ʹ� ���ƿ�!");
				} //else 
			}//else

		}//while
		sc.close();
	}//main
}//class





