package ���;

import java.util.Scanner;

public class SwitchTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ȣ: ");
		String cn = sc.next(); 
		char data = cn.charAt(0); //A100  B200  C300
		
		System.out.println("----------------");
		
		switch (data) {
		case 'A':
			System.out.println(data + "�� ��ȹ��");
			break;
		case 'B':
			System.out.println(data + "�ѹ���");
			break;
		case 'C':
			System.out.println(data + "�λ��");
			break;
		default:
			System.out.println(data + "���� �μ� �Դϴ�.");
			break;
		}
	}

}
