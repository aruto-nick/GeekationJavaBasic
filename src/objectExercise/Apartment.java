package objectExercise;

	//Propertyのサブクラス：マンション
	class Apartment extends Property {
		  Apartment(String name, String owner, String weight,double price, String layout) {
		    // Propertyクラスのコンストラクタを呼び出す
		    super(name, owner, weight,price,layout);
		  }
	}