package ������;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class �׷����׽�Ʈ3 {
	private static JTextField t1;
	private static JTextField t2;
	
	static int count = 0; //��ü ����
	static int price_jb = 5000; //«�Ͱ���
	static int price_wd = 6000; //�쵿����
	static int price_jj = 7000; //���尡��
	static int total = 0;
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		JLabel img = new JLabel("");
		
		JButton btnNewButton = new JButton("\uC9EC\uBF55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("«��.jpg");
				img.setIcon(icon);
				count++; //����������
				t1.setText(count + "��");
				
				total = total  + price_jb;
				t2.setText(total + "��");
			}
		});
		btnNewButton.setFont(new Font("����", Font.BOLD, 40));
		btnNewButton.setBounds(61, 23, 119, 85);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uC6B0\uB3D9");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("�쵿.jpg");
				img.setIcon(icon);
				
				count++;
				t1.setText(count + "��");
				
				total = total  + price_wd;
				t2.setText(total + "��");
			}
		});
		button.setFont(new Font("����", Font.BOLD, 40));
		button.setBounds(192, 23, 119, 85);
		f.getContentPane().add(button);
		
		
		JButton button_1 = new JButton("\uC790\uC7A5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("¥��.jpg");
				img.setIcon(icon);
				count++;
				t1.setText(count + "��");
				
				total = total  + price_jj;
				t2.setText(total + "��");
			}
		});
		button_1.setFont(new Font("����", Font.BOLD, 40));
		button_1.setBounds(323, 23, 119, 85);
		f.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 40));
		lblNewLabel.setBounds(515, 37, 105, 57);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 255));
		t1.setFont(new Font("����", Font.BOLD, 45));
		t1.setBounds(632, 39, 220, 60);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		img.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\uC9DC\uC7A5.jpg"));
		img.setBounds(87, 148, 755, 346);
		f.getContentPane().add(img);
		
		JLabel label = new JLabel("\uC9C0\uBD88\uD560 \uCD1D \uAE08\uC561");
		label.setFont(new Font("����", Font.BOLD, 40));
		label.setBounds(87, 535, 389, 57);
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setForeground(new Color(255, 0, 0));
		t2.setFont(new Font("����", Font.BOLD, 45));
		t2.setColumns(10);
		t2.setBounds(438, 532, 414, 60);
		f.getContentPane().add(t2);
		f.setSize(965, 674);

		f.setVisible(true);
	}
}
