package ��������;

import javax.swing.JOptionPane;

public class �⺻�����2 {

	public static void main(String[] args) {
		//���̸� �Է��ؼ�, ���� ���̸� ���غ�����. (+1)
		//Integer.parseInt()�� �̿�
		String age = JOptionPane.showInputDialog("�����Է�");
		int age2 = Integer.parseInt(age);
		System.out.println("���� ���̴� " + (age2 + 1) + "��");
		
		//Ű�� �Է��ؼ�, ���� Ű�� ���غ�����. (+5)
		//Double.parseDouble()
		String height = JOptionPane.showInputDialog("Ű�Է�");//185.5
		double height2 = Double.parseDouble(height);
		System.out.println("���� Ű�� " + (height2 + 5) + "cm");
		
		//��ħ�� �Ծ�����? true
		String food = JOptionPane.showInputDialog("��ħ�� �Ծ�����");//true
		boolean food2 = Boolean.parseBoolean(food);
		System.out.println("��ħ�� �Ծ����� ���� " + food2);
		
		if(food2 == true) {
			System.out.println("�谡 �θ��ðڱ���.");
		}else {
			System.out.println("�谡 �����ðڱ���.");
		}	
		
	}
}





