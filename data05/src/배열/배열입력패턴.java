package �迭;

import java.util.Scanner;

public class �迭�Է����� {

	public static void main(String[] args) {
//		1.������ ���� �Է��Ͽ� ��µǵ���!
//		����: java
//		����: jsp
//		����: spring
//		------------
//		java���ٴ� spring!!

		Scanner sc = new Scanner(System.in);
		String[] subject = new String[3];
		for (int i = 0; i < subject.length; i++) {
			System.out.print("����: ");
			String data = sc.next();
			subject[i] = data;
		}
		System.out.println(subject[0] + "���ٴ� " + subject[2]);
		
		//��ġ�� �˰� ������ index�� Ȯ��!
		//�迭 ��ü�߿��� �����ΰ��� ã�ų�, ���ǿ� 
		//�����ϴ� ���� ó���ؾ� �ϴ� ���
		//for���� ������ �Ѵ�.!
		for (int i = 0; i < subject.length; i++) { 
			if(subject[i].equals("jsp")) {
				System.out.println("index: " + i);
			}
		}
		
//		2. �Է��Ͽ� ����� ���
//		�Է�: 100
//		�Է�: 200
//		�Է�: 300
//		-----------
//		ù��°���� ���������� ���� 400
	}

}
