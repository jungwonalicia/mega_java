package ������;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ��ǰ���Ẹ�� {

	public static void main(String[] args) {
		//��¥, �ð� ���ϴ� ��.
		Date d1 = new Date();
		int hour = d1.getHours(); //deprecated
		System.out.print(hour + "�� ");
		int min = d1.getMinutes();
		System.out.print(min + "�� ");
		int sec = d1.getSeconds();
		System.out.println(sec + "�� ");
		
		int year = d1.getYear();
		System.out.println("���ش� " + (year + 1900) + "��");
		
		int month = d1.getMonth();
		System.out.println("�̹� ���� " + (month + 1) + "��");
		
		int date = d1.getDate();
		System.out.println("������ " + date + "��");
		
		int day = d1.getDay();
		System.out.println("������ " + day + "����");
		//0: ��~ 6:��
		
		//����
		Random r = new Random(42); //seed��
		int num = r.nextInt(46); //0~45
		System.out.println(num);
		
		//int count = 0;		
		//�ֿܼ��� �Է��ؼ� �ڵ����� Ÿ���� �ٲپ��ִ� ���
		Scanner sc = new Scanner(System.in); //Ű���� �ֿܼ��� �Է�
		System.out.print("�̸��� �Է�>> ");
		String name = sc.next();
		System.out.println("����� �̸��� " + name);
		
		System.out.print("���̸� �Է�>> ");
		int age = sc.nextInt(); //String-->int��ȯ
		System.out.println("���� ���̴� " + (age + 1));
		sc.close();
	}
}
