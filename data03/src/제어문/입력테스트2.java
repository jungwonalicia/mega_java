package ���;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class �Է��׽�Ʈ2 {

	public static void main(String[] args) {
		//1. �Է¹޴� Ŭ���� �ʿ�
		//ctrl + shift + o(����) : �ڵ�import
		Scanner sc = new Scanner(System.in);
		
		 while (true) {
			System.out.print("�Է�(����:x)>> ");
			String data = sc.next();
			//���� ���ϴ� ��� �񱳿����ڴ� �⺻������Ÿ�Ը� �� ���ִ�.
			//�⺻ ������ Ÿ��: ����, �Ǽ�, ����, ��(boolean)
			if (data.equals("x")) { //true/false
				JOptionPane.showMessageDialog(null, "�ý��������մϴ�.");
				break; //break�� �����ϰ� �ִ� �ݺ����� ������.
			}
			System.out.println("����� �Է� �����ʹ� " + data);
		}
		//2. �ֿܼ� ����Ʈ
		 sc.close();
	}
}





