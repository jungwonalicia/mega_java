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

public class �׷����׽�Ʈ {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("PUSH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "��ħ�� �Ծ�����?");
				if (result == 0) {
					JOptionPane.showMessageDialog(null, "�谡 �θ��ðڱ���.");
				} else if (result == 1) {
					JOptionPane.showMessageDialog(null, "�谡 �����ðڱ���.");
				} else {
					JOptionPane.showMessageDialog(null, "�������ñ���.");
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("����", Font.BOLD, 40));
		btnNewButton.setBounds(49, 85, 171, 146);
		f.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("\uD64D\uAE38\uB3D9\uC758 \uC708\uB3C4\uC6B0");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 40));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(254, 85, 324, 42);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setForeground(new Color(255, 255, 0));
		t1.setBackground(new Color(0, 0, 255));
		t1.setFont(new Font("����", Font.BOLD, 40));
		t1.setBounds(264, 137, 297, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setForeground(Color.YELLOW);
		t2.setFont(new Font("����", Font.BOLD, 40));
		t2.setColumns(10);
		t2.setBackground(Color.BLUE);
		t2.setBounds(264, 194, 297, 47);
		f.getContentPane().add(t2);

		JButton button = new JButton("\uB098\uB97C \uB20C\uB7EC...!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				if (id.equals("root") && pw.equals("1234")) {
					JOptionPane.showMessageDialog(null, "�α��� ok");
				} else {
					JOptionPane.showMessageDialog(null, "�α��� not");
				}
				t1.setText("");
				t2.setText("");
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("�޸�����ü", Font.BOLD, 60));
		button.setBackground(new Color(255, 0, 0));
		button.setBounds(49, 269, 494, 146);
		f.getContentPane().add(button);
		f.setSize(623, 500);

		f.setVisible(true);
	}
}
