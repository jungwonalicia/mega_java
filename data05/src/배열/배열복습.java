package �迭;

public class �迭���� {

	public static void main(String[] args) {
		// 100���� ��ȭ�����Ͱ� �ʿ�.
		String[] names = new String[100]; // String ������ ����
		// �迭�� �ڵ� �ʱ�ȭ int ->0, double ->0.0
		// String ->null
		System.out.println(names); // ������ ���� �ּҰ�
		System.out.println(names.length); // ������ ����ִ� �б� ���� ����
		System.out.println(names[0]); // index�� 0���� ����
		names[0] = "�����"; // ù��°
		System.out.println(names[0]);
		names[names.length - 1] = "1917"; // ������
		for (int i = 0; i < names.length; i++) { //i�� index
			System.out.println(i + ": " + names[i]);
		}
		//foreach(each = �ϳ���!)
		for (String n : names) {
			System.out.println(n);
		}
		
		int[] customers = new int[100];
		customers[0] = 1000;
		customers[99] = 500;
		
		for (int i = 0; i < customers.length; i++) { //index
			System.out.println(i + ": " + customers[i]);
		}
		
		for (int c : customers) { //integer
			System.out.println(c);
		}
	}
}







