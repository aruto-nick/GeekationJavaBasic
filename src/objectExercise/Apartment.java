package objectExercise;

	//Propertyのサブクラス：マンション
	class Apartment extends Property {
		  Apartment(String name, String owner, String weight,double price, String layout) {
		    // superの意味は後ほど解説します
		    super(name, owner, weight,price,layout);
		  }
	}