package �迭��ȭ;

import java.util.Random;

public class �����迭 {

	public static void main(String[] args) {
		//�����ϰ� ���� 1000�� ���Ѽ�,
		Random r = new Random(42); //������ ����, ��������
		//seed��(���Ѱ�)
		//1000���� �����͸� ������ �� �ִ� ���� �ʿ� 
		//=>�迭(array)
		int[] numbers = new int[1000];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000); //0~999
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + ": " + numbers[i]);
		}
		
		//�ִ밪�� �������� ã�ƺ���,
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i]; 
			}
		}
		System.out.println("�ִ밪�� " + max);
		
		//��ġ�� ������� ã�ƺ���,
		//max���� ��� �ִ��� ã�ƺ��ô�.!
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (max == numbers[i]) {
				System.out.println(max + "���� ��ġ�� " + i);
				count++;
			}
		}
		
		//�� ���� �ִ��� ã�ƺ��ô�.
		System.out.println(max + "���� ������ " + count + "��");
	}

}
