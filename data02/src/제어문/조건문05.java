package ���;

import javax.swing.JOptionPane;

public class ���ǹ�05 {

	public static void main(String[] args) {
//		������ ������ 1)�� 2)�帲 3)�� 4)ȭâ
//		1�̳� 3�̸� ����ö�� Ÿ�� ����.(or -> ||)
//		�������� ������ Ÿ�� ����.
		String choice = JOptionPane.showInputDialog("������ ������ 1)�� 2)�帲 3)�� 4)ȭâ");
		int choice2 = Integer.parseInt(choice);
		if (choice2 == 1 || choice2 == 3) {
			JOptionPane.showMessageDialog(null, "����öŸ�� ����");
		} else if(choice2 == 2) {
			JOptionPane.showMessageDialog(null, "����Ÿ�� ����");
		} else {
			JOptionPane.showMessageDialog(null, "�ɾ� ����");
		}
	}
}




