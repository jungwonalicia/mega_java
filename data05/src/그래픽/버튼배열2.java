package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ư�迭2 {
	static int i;
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1100, 1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		for (int i = 0; i < 300; i++) {
			JButton b = new JButton(i + "");
			f.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(b.getText().equals("����")) {
						f.setTitle("����Ұ�");
					}else {
						count++; //������ �ο� ī��Ʈ
						f.setTitle(count + "�� ������.");
						b.setText("����");//��ư ���� ���� �÷���.
						b.setEnabled(false); //��ư�� ����� ����Ұ������� ����
						b.setBackground(Color.red);//��ư ��� ��
						b.setForeground(Color.yellow);//��ư ���� ��
						System.out.println(b.getText() + "��ư�� ������.");
					}
				}
			});
		}

		f.setVisible(true);
	}
}
