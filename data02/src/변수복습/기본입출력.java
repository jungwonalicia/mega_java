package ��������;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class �⺻����� {

	public static void main(String[] args) {
		// ����� �����ϴ� ������?
		// �Է��� ���� ���� ������ String���� �ν��Ѵ�.
		String name = JOptionPane.showInputDialog("����� �����ϴ� ������?");

		// ����� �����ϴ� ������ ¥����̱���!
		System.out.println("����� �����ϴ� ������ " + name + "�̱���!");
		
		//Scanner sc = new Scanner(System.in);
		
		String age = JOptionPane.showInputDialog("���̸� �Է�?");
		//String -> intó��
		//100(o), aaa(x)
		int age2 = Integer.parseInt(age); //"100"->100
		
		System.out.println("������ �� ���̴� " + (age2 + 1) + "��");
	}
}





