package ����;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class ������ {

	public static void main(String[] args) {
		//�Է��� ���� ���� ��� Ÿ���� String���� ó��!!!
//		String name = JOptionPane.showInputDialog("�̸��� �Է�");
		//String age = JOptionPane.showInputDialog("���̸� �Է�");
		//����� �ֿ� ���α׷��� ���� �����ΰ���?
		//����� ���� ���� �����ΰ���?
		
		//System.out.println("����� �̸��� " + name + "�Դϴ�.");
		//System.out.println("����� ���̴� " + age + "���Դϴ�.");
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JTree tree = new JTree();
		f.getContentPane().add(tree, BorderLayout.NORTH);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uB9C8\uC9C0\uB9C9 \uC2DC\uAC04\uC778\uAC00\uC694?");
		rdbtnNewRadioButton.setFont(new Font("����", Font.BOLD, 30));
		f.getContentPane().add(rdbtnNewRadioButton, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("\uB098\uB294 \uBC84\uD2BC1");
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uB098\uB3C4 \uBC84\uD2BC");
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uB098\uB3C4 \uBC84\uD2BC3");
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		f.setVisible(true);
		
		
		
		
		
	}
}
