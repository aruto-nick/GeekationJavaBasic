package objectExercise;

	public class Main {
		  public static void main(String[] args) {
		    Apartment dog = new Apartment("アパートメント", "山田　マンション太郎", "マンション",5000000,"3LDK");
		    dog.greeting();
		 
		    Land cat = new Land("の土地", "山田　土地太郎", "土地", 8000000, "105.2㎡");
		    cat.greeting();
		  }
	}
