package �迭��ȭ;

public class ��ġ���ٲ㺾�ô� {

	public static void main(String[] args) {
		int[] num = { 66, 77, 33, 22, 99 };
		int temp = num[0]; //temp <- 66
		num[0] = num[1]; //66<- 77
		num[1] = temp; //77<- temp
		for (int i : num) {
			System.out.println(i);
		}
	}
}
