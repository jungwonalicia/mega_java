package ���;

import java.util.Scanner;

public class SwitchTest6 {

	public static void main(String[] args) {
		//�Է� Ŭ���� �ʿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է¹޾ƺ��ô�");
		System.out.print("ù��° ��: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ��: ");
		int num2 = sc.nextInt();
		System.out.print("������: ");
		String oper = sc.next(); //char, String�� �Է�
		System.out.println("----------------");
		
		switch (oper) {
		case "+":
			System.out.println("�� ���� ���� " + (num1 + num2));
			break;
		case "-":
			System.out.println("�� ���� ���� " + (num1 - num2));
			break;
		case "*":
			System.out.println("�� ���� ���� " + (num1 * num2));
			break;
		case "/":
			System.out.println("�� ���� �������� " + (num1 / num2));
			break;
		default:
			System.out.println("������ ���� �Դϴ�.");
			break;
		}
		
		
		
		
		
	}

}
