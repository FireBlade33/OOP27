package lesson6dz;

public class MainNumber {

	public static void main(String[] args) {
		Number num = new Number(3);
		Number num1 = new Number(2);
		
		
		num1.add(num);
		num.sub(num1);
		num.mul(num1);
		num.div(num1);
		num1.pow(num);
		num.mod(num1);
		num.get();

	}

}
