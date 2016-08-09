package lesson6dz;

public class Number {
	int number;
	
	public Number(int number){
		this.number = number;
	}
	
	public int get(){
		return number;
	}
	
	public Number add(Number num){
		Number result = new Number(number + num.number);
		return result;
	}
	
	public Number sub(Number num){
		Number result = new Number(number - num.number);
		return result;
	}
	
	public Number mul(Number num){
		Number result = new Number(number * num.number);
		return result;
	}
	
	public Number div(Number num){
		Number result = new Number(number / num.number);
		return result;
	}
	
	public Number pow(Number exponent){
		Number result = new Number((int)Math.pow(number, exponent.number));
		return result;
	}
	
	public Number fact(){
		int a = 1;
		for(int i = 1; i <= number; i++){
			a = a * i;
		}
		Number res = new Number(a);
		return res;
		
		}
	
	public Number mod(Number num){
		Number result = new Number(number % num.number);
		return result;
	}
	
	

}
