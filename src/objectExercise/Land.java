package objectExercise;

	//Propertyのサブクラス：土地
	class Land extends Property {
	  Land(String name, String owner, String weight,double price, String layout) {
		// Propertyクラスのコンストラクタを呼び出す
	    super(name, owner, weight,price,layout);
	  }
	}
