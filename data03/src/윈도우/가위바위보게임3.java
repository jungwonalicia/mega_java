package ������;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class ��������������3 {
	static int count = 0;
	
	public static void main(String[] args) {
		// 1. �����ӿ� �ش��ϴ� Ŭ���� �ʿ�.
		JFrame f = new JFrame();
		f.setSize(971, 518);
		f.setTitle("���� ���� �� ����");
		JLabel result = new JLabel("\uAC8C\uC784 \uACB0\uACFC \uB098\uD0C0\uB0A0 \uC790\uB9AC");

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				//result.setText("������ ������");				
				//JOptionPane.showMessageDialog(null, "������ ������");
				//��ǻ�Ͱ� ���� ��.
				//���� ��ǻ�Ϳ� ���ؼ� ���� Ȯ��
				Random r = new Random();
				int computer = r.nextInt(3);
				if (computer == 0) { //���� 
					result.setText("���");
				}
				if (computer == 1) { //����
					result.setText("��ǻ�� ��");
				}
				if (computer == 2) { //��
					result.setText("�� ��");
				}
				f.setTitle("���� ���� �� ����** �Ѱ���Ƚ��: " + count);
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setIcon(new ImageIcon("E:\\garden\\git_java\\data03\\\uAC00\uC704.png"));
		btnNewButton.setFont(new Font("����", Font.BOLD, 60));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				//result.setText("������ ������");	
				//JOptionPane.showMessageDialog(null, "������ ������");
				Random r = new Random();
				int computer = r.nextInt(3);
				if (computer == 0) { //���� 
					result.setText("�� ��");
				}
				if (computer == 1) { //����
					result.setText("���");
				}
				if (computer == 2) { //��
					result.setText("��ǻ�� ��");
				}
				f.setTitle("���� ���� �� ����** �Ѱ���Ƚ��: " + count);
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setIcon(new ImageIcon("E:\\garden\\git_java\\data03\\\uBC14\uC704.png"));
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 60));
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				//result.setText("���� ������");	
				//JOptionPane.showMessageDialog(null, "���� ������");
				Random r = new Random();
				int computer = r.nextInt(3);
				if (computer == 0) { //���� 
					result.setText("��ǻ�� ��");
				}
				if (computer == 1) { //����
					result.setText("�� ��");
				}
				if (computer == 2) { //��
					result.setText("���");
				}
				f.setTitle("���� ���� �� ����** �Ѱ���Ƚ��: " + count);
			}
		});
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setIcon(new ImageIcon("E:\\garden\\git_java\\data03\\\uBCF4.png"));
		btnNewButton_2.setFont(new Font("����", Font.BOLD, 60));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);

		
		result.setFont(new Font("����", Font.BOLD, 20));
		f.getContentPane().add(result, BorderLayout.SOUTH);

		f.setVisible(true);
	}

}
