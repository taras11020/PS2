package base;

//I am creating a public class called MyINteger
public class MyInteger {
	
	//Here I am creating an int data field named iValue that stores the int value represented by this object.
	private int iValue;
	
	//Here I am creating a constructor that creates MyInteger object for iValue
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	//A get method that returns iValue
	public Integer getiValue(){
		return iValue;
	}
	
	
	//figuring out if integer is even
	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
		return false;	
	}
	
	//figuring out if integer is odd
	public boolean isOdd() {
		if (iValue % 2 >0 || iValue %2 <0){
			return true;
		}
		return false;
	}
	
	//figuring out if integer is prime
	public boolean isPrime(){
		int i = 0;
		for (i = 2; i <= iValue/2; i++) {
			if (iValue % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	// Creating static methods 
	
	public static boolean isEven(int iValue) {
		return (iValue % 2 ==0);
	}
	
	public static boolean isOdd(int iValue){
		return (iValue % 2 !=0);
	}
	
	public static boolean isPrime( int iValue){
		for (int k1=2; k1 < iValue/2; k1++) {
			if (iValue % k1 !=0){
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean isEven(MyInteger t){
		return t.isEven();
	}
	
	public static boolean isOdd(MyInteger t){
		return t.isOdd();
		
	}
	
	public static boolean isPrime(MyInteger t){
		return t.isPrime();
	}
	
	public boolean equals(MyInteger f){
		return equals(f.getiValue());
	}
	
	public boolean equals(int m) {
		return (iValue == m);
	}
}
	

