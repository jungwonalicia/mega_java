package �迭;

public class �����͸��˰��ִ¹迭 {

	public static void main(String[] args) {
		String[] names = { "ȫ�浿", "��浿", "�۱浿"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// �ƴ� ������� ����(int): for, foreach
		int[] ages = { 100, 55, 77, 10, 25 };
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		for (int i : ages) {
			System.out.println(i);
		}
		
		// ����(char)

		char[] gender = { '��', '��', '��', '��', '��' };
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}

		for (char c : gender) {
			System.out.println(c);
		}

		// �÷�(double)
		double[] eye = { 0.3, 1.5, 0.7, 0.9, 1.0 };

		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}
		for (double d : eye) {
			System.out.println(d);
		}

		System.out.println("----------------");
		char[] c = { 'a', 'b', 'c' };
		System.out.println(c);

	}
}
