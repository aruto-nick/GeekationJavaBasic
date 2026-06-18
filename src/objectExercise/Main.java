package objectExercise;

public class Main {
	  public static void main(String[] args) {
		Apartment test = new Apartment("いい感じアパートメント", "山田 マンション太郎", "マンション", 50000000, "3LDK");
	    
		test.explanation();
	    
		Land land = new Land("いい感じの土地", "山田　土地太郎", "土地", 80000000, "105.2㎡");
		
		land.explanation();
	  }
}
