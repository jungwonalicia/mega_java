package �迭;

import java.util.Scanner;

public class ���忹�Žý��� {
	static int count; //�� Ŭ�������� ��ü �������� ��� ����
							//��������(global, �۷ι� ����)
							//���������� �ڵ� �ʱ�ȭ
	
	public static void main(String[] args) {
		int[] seat = new int[10];

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("----------------------");
			for (int i : seat) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("----------------------");
			System.out.print("�����ϰ� ���� �¼� ��ȣ(����: -1)>> ");
			int choice = sc.nextInt();
			//choice�� ��������(local, ���ú���)
			//����� ��ġ�� �߿�.!
			//���������� �ڵ��ʱ�ȭ �ȵ�.
			//���������� �ʱ�ȭ�� ���α׷��Ӱ� ���־�� ��.
			//choice�� �����ϰ� �ִ� �߰���ȣ({ })�������� ��� ����
			if (choice == -1) {
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("���� �ο�: " + count + "��");
				System.out.println("���� �ݾ�: " + (count * 10000) + "��");
				break; //while break;
			}
			if (seat[choice - 1] == 1) {
				System.out.println("���Ű� �Ұ����մϴ�.");
				System.out.println("�ٸ� �¼��� �������ּ���.");
			} else {
				System.out.println("���Ÿ� �����մϴ�.");
				seat[choice - 1] = 1;
				count++; //����������
			} 
		}
		
		
		
		
	}
}
