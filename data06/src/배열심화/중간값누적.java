package �迭��ȭ;

public class �߰������� {

	public static void main(String[] args) {
		//1~100������ �� �߿��� ¦���� ���ؼ� �迭�� �־�ô�.
		int[] even = new int[50]; //0~49
		
		int index = 0; //¦�� �迭�� �ش��ϴ� �ε���
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) { //%�� ������ ������.
				even[index] = i;
				index++;
			}
		}
		for (int i : even) {
			System.out.println(i);
		}
	}
}
