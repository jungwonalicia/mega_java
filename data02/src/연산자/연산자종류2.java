package ������;

import javax.swing.JOptionPane;

public class ����������2 {

	public static void main(String[] args) {
		//�Ѱ����� �Է¹�������.
		String price = JOptionPane.showInputDialog("�Ѱ���");
		int price2 = Integer.parseInt(price);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//���ο����� �Է¹�������.
		System.out.println(price2);
		//�� ��� �󸶾� �����ϴ°�?(�Ҽ���)
	}

}
