package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 2 ;
		int b = 1 ;
		boolean isEqualA = (a > b);

		boolean isSunny = true;
		boolean isWarm = true;
		boolean isWeather = (isSunny == true  && isWarm == true);

		int x = 3;
		int y = 4;
		boolean isResearch = (x >= 0 && (y % 2) == 0);

		boolean hasPermission = false;

		System.out.println(isEqualA);
		System.out.println(isWeather);
		System.out.println(isResearch);
		System.out.println(! hasPermission);
	}

}
