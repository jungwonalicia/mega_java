package ���;

import java.util.Random;
import java.util.Scanner;

public class �������������� {

	public static void main(String[] args) {
//		���� ���� �� ����: 1ȸ�� ������.
//		0: ����, 1: ����, 2: ��
//		-------------
//		1. ��ǻ�Ͱ� �����ϰ� ������.(0~2)
		Random	r = new Random();
		int computer = r.nextInt(3); //0,1,2
		//r.nextInt() -21~21 �߻�!
		//r.nextInt(����) 0~����-1 �߻�! ������ ���� �� �ִ�.
		System.out.println("��ǻ��: " + computer);
		
//		2. �Է��� �޾� ���� ������.(0~2)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��(0: ����, 1: ����, 2: ��)>> ");
		int me = sc.nextInt();
		System.out.println("��: " + me);
		
		
//		3. ���� ���� Ȯ��
//		if(me == 0)
//			if(com == 0) ���
//			if(com == 1) ��ǻ�� ��
//			if(com == 2) ���� ��
//		if(me == 1)
//		if(me == 2)
		
		if (me == 0) {
			System.out.println("���� ������ ��");
			if (computer == 0) {
				System.out.println("��ǻ�Ͱ� ������ ��");
				System.out.println("���");
			}
			if (computer == 1) {
				System.out.println("��ǻ�Ͱ� ������ ��");
				System.out.println("��ǻ�� ��");
			}
			if (computer == 2) {
				System.out.println("��ǻ�Ͱ� ���� ��");
				System.out.println("�� ��");
			}
		}
		if (me == 1) {
			System.out.println("���� ������ ��");
			if (computer == 0) {
				System.out.println("��ǻ�Ͱ� ������ ��");
				System.out.println("�� ��");
			}
			if (computer == 1) {
				System.out.println("��ǻ�Ͱ� ������ ��");
				System.out.println("���");
			}
			if (computer == 2) {
				System.out.println("��ǻ�Ͱ� ���� ��");
				System.out.println("��ǻ�� ��");
			}
		}
		if (me == 2) {
			System.out.println("���� ���� ��");
			if (computer == 0) {
				System.out.println("��ǻ�Ͱ� ������ ��");
				System.out.println("��ǻ�� ��");
			}
			if (computer == 1) {
				System.out.println("��ǻ�Ͱ� ������ ��");
				System.out.println("�� ��");
			}
			if (computer == 2) {
				System.out.println("��ǻ�Ͱ� ���� ��");
				System.out.println("���");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
