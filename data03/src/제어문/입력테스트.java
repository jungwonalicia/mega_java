package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ {
	
	public static void main(String[] args) {
		
		//�Է¿� ��ǰ(class)�� �����ؿɽô�.
		Scanner sc = new Scanner(System.in);
		//������ ������? ȭâ �Է�!
		System.out.print("������ ������? ");
		String weather = sc.next();
		System.out.println("����! " + weather + "�ϱ���!");
		
		//� �ΰ���? 1
		System.out.print("� �ΰ���? ");
		int temp = sc.nextInt(); //String->int
		
		if (temp >= 0) {
			System.out.println("���� �Ծ��!!");
		} else {
			System.out.println("���� �ȿԾ��!!");
		}
		sc.close();
	}
}
