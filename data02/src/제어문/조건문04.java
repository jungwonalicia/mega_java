package ���;

import javax.swing.JOptionPane;

public class ���ǹ�04 {

	public static void main(String[] args) {
		String i = JOptionPane.showInputDialog("id");
		String p = JOptionPane.showInputDialog("pw");
		int id = Integer.parseInt(i);
		int pw = Integer.parseInt(p);
		
		if (id == 1111 && pw == 2222) {
			System.out.println("�α��� ok");
		} else {
			System.out.println("�α��� not");
		}
	}
}
