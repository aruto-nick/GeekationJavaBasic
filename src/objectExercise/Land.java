package objectExercise;

	//Propertyのサブクラス：土地
	class Land extends Property {
	  Land(String name, String owner, String weight,double price, String layout) {
	    // superの意味は後ほど解説します
	    super(name, owner, weight,price,layout);
	  }
	}
