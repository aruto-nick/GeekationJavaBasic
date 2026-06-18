package objectExercise;

	//Propertyのサブクラス：土地
	class Land extends Property {
		
		//フィールド
		private String large;
		
		//コンストラクタ = クラス名
		Land(String name, String owner, String weight, double price, String large){
			super(name, owner, weight, price);
			this.large = large;
		}
		
		//メソッド
		public void explanation(){
			super.explanation();
			System.out.println("広さ:" + this.large);
		}
		
	}