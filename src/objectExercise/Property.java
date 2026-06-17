package objectExercise;

	class Property {
		  private String name;
		  private String owner;
		  private String weight;
		  private double price;
		  private String layout;
		 
		  Property(String name, String owner, String weight,double price, String layout) {
		    this.name = name;
		    this.owner = owner;
		    this.weight = weight;
		    this.price = price;
		    this.layout = layout;
		  }
		 
		  public void greeting() {
		    System.out.println("物件名：いい感じ" + this.name );
		    System.out.println("物件所有者名：" + this.owner );
		    System.out.println("物件種別：" + this.weight );
		    System.out.println("物件価格：" + this.price +"円");
		    System.out.println("間取り：" + this.layout );
		  }
	}
