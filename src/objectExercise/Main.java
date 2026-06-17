package objectExercise;

	public class Main {
		  public static void main(String[] args) {
			//インスタンス生成　「クラス型 変数名 = new クラス名();」
		    Apartment apart = new Apartment("アパートメント", "山田　マンション太郎", "マンション",5000000,"間取り：3LDK");
		    //インスタンスメソッド実行「変数名.インスタンスメソッド名;」
		    apart.explanation();
		 
		    Land land = new Land("の土地", "山田　土地太郎", "土地", 8000000, "広さ：105.2㎡");
		    land.explanation();
		  }
	}
