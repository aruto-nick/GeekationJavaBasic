package basicSyntax;

public class MethodPractice {


    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        results( add(a,b) );
        results( dif(a,b) );
        results( multiple(a,b) );
        results( divide(a,b) );
    }

    // メソッド1: 二つの値を足し算
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    //メソッド2: 二つの値を引き算
    public static int dif(int num1,int num2) {
    	 return num1 -num2;
    }
    
    //メソッド3: 二つの値を掛け算
    public static int multiple(int num1, int num2) {
    	return num1 * num2;
    }
    
    //メソッド4: 二つの値を割り算
    public static int divide(int num1,int num2) {
    	return num1 / num2;
    }
    
    // メソッド5: 計算結果を出力
    public static void results(int result) {
        System.out.println("計算結果は" + result + "です。");
	}
	
}
