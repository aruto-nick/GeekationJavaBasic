package objectExercise;

//Propertyのサブクラス：マンション
class Apartment extends Property {
	
	//フィールド:コンストラクタの引数使うよ
	private String floor;
	
	//コンストラクタ　＝　クラス名
	Apartment (String name, String owner, String weight, double price, String floor){
		super(name,owner,weight,price);
		this.floor = floor;
	}
	
	//メソッド
	public void explanation(){
		super.explanation();
		System.out.println("間取り:" + this.floor);
	}
}