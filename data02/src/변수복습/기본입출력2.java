package 변수복습;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		//나이를 입력해서, 내년 나이를 구해보세요. (+1)
		//Integer.parseInt()를 이용
		String age = JOptionPane.showInputDialog("나이입력");
		int age2 = Integer.parseInt(age);
		System.out.println("내년 나이는 " + (age2 + 1) + "세");
		
		//키를 입력해서, 내년 키를 구해보세요. (+5)
		//Double.parseDouble()
		String height = JOptionPane.showInputDialog("키입력");//185.5
		double height2 = Double.parseDouble(height);
		System.out.println("내년 키는 " + (height2 + 5) + "cm");
		
		//아침을 먹었나요? true
		String food = JOptionPane.showInputDialog("아침을 먹었나요");//true
		boolean food2 = Boolean.parseBoolean(food);
		System.out.println("아침을 먹었는지 여부 " + food2);
		
		if(food2 == true) {
			System.out.println("배가 부르시겠군요.");
		}else {
			System.out.println("배가 고프시겠군요.");
		}	
		
	}
}





