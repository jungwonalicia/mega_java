package ���;

import java.util.Random;
import java.util.Scanner;

public class ��������������2 {

	public static void main(String[] args) {
//		���� ���� �� ����: 1ȸ�� ������.
//		0: ����, 1: ����, 2: ��
//		-------------
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int comWin = 0; // �� �̱�
		int meWin = 0; // �� �̱�
		int draw = 0; // ���

		while (true) {
			int computer = r.nextInt(3); // 0,1,2
			// System.out.println("��ǻ��: " + computer);
			System.out.print("���� ��(0: ����, 1: ����, 2: ��, -1: ����)>> ");
			int me = sc.nextInt(); // �Է�
			if (me == -1) {
				System.out.println("�������������� ����.");
				System.out.println("-------------");
				System.out.println("���� �̱� Ƚ��: " + meWin + "ȸ");
				System.out.println("���� �̱� Ƚ��: " + comWin + "ȸ");
				System.out.println("��� Ƚ��: " + draw + "ȸ");
				int sum = meWin + comWin;
				double result = (double) meWin / sum * 100;
				System.out.println("���� �·�: " + (int) result + "%");
				break;
			}

			// System.out.println("��: " + me);
			if (me == 0) {
				System.out.println("���� ������ ��");
				if (computer == 0) {
					System.out.println("��ǻ�Ͱ� ������ ��");
					System.out.println("���");
					draw++;
				}
				if (computer == 1) {
					System.out.println("��ǻ�Ͱ� ������ ��");
					System.out.println("��ǻ�� ��");
					comWin++;
				}
				if (computer == 2) {
					System.out.println("��ǻ�Ͱ� ���� ��");
					System.out.println("�� ��");
					meWin++;
				}
			}
			if (me == 1) {
				System.out.println("���� ������ ��");
				if (computer == 0) {
					System.out.println("��ǻ�Ͱ� ������ ��");
					System.out.println("�� ��");
					meWin++;
				}
				if (computer == 1) {
					System.out.println("��ǻ�Ͱ� ������ ��");
					System.out.println("���");
					draw++;
				}
				if (computer == 2) {
					System.out.println("��ǻ�Ͱ� ���� ��");
					System.out.println("��ǻ�� ��");
					comWin++;
				}
			}
			if (me == 2) {
				System.out.println("���� ���� ��");
				if (computer == 0) {
					System.out.println("��ǻ�Ͱ� ������ ��");
					System.out.println("��ǻ�� ��");
					comWin++;
				}
				if (computer == 1) {
					System.out.println("��ǻ�Ͱ� ������ ��");
					System.out.println("�� ��");
					meWin++;
				}
				if (computer == 2) {
					System.out.println("��ǻ�Ͱ� ���� ��");
					System.out.println("���");
					draw++;
				}
			}
		}
		sc.close();
	}

}
