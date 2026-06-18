package objectExercise;

	class Property {
		//インスタンスフィールド（属性）の定義「public データ型　インスタンスフィールド名」
		  private String name;
		  private String owner;
		  private String weight;
		  private double price;
		 
		  Property(String name, String owner, String weight,double price) {
			//インスタンスメソッドでインスタンスフィールドを使う　「this.インスタンスフィールド名」
		    this.name = name;
		    this.owner = owner;
		    this.weight = weight;
		    this.price = price;
		  }
		 
		  //インスタンスメソッド（機能）の定義　「public 戻り値のデータ型 メソッド名() {処理;}」
		  public void explanation() {
		    System.out.println("物件名：" + this.name );
		    System.out.println("物件所有者名：" + this.owner );
		    System.out.println("物件種別：" + this.weight );
		    System.out.println("物件価格：" + this.price +"円");
		  }
	}
