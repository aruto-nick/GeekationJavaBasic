package basicSyntax;

public class GeekIntroduction {
	
	public static void greeting(int age,double height) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちは！私はGeek君でごわす");
		System.out.println("年は"+age+"でごわす。");
		System.out.println("身長は"+height+"でごわす。");
	}

	public static void specialSkill(int num1, int num2){
		if(num1<1 || num2<1){
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;
		}
		if(num2 <= num1){
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		}
		if (300 < num1 || 300 < num2) {
			System.out.println("num1とnum2は300以下にしてください。");
			return;
		}
		
		for (int a =num1; num1<= a&& a<=  num2; a++){
			if (a % 3==0 && a % 5 == 0) {
				System.out.println(a+"は3の倍数かつ5の倍数です。");
				continue;
			}else if(a % 3 ==0) {
				System.out.println(a+"は3の倍数です。");
				continue;
			}else if (a % 5 == 0) {
				System.out.println(a+"は5の倍数です。");
				continue;
			}
		}
	}


}
