package lesson6dz;

public class Fraction {
	int numerator;
	int denominator;
	
	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction add(Fraction frac){
		Fraction r = new Fraction(numerator + frac.numerator, denominator + frac.denominator);
		return r;
	
	}
	
	public Fraction sub(Fraction frac){
		Fraction r = new Fraction(numerator - frac.numerator, denominator - frac.denominator);
		return r;
	
	}
	
	public Fraction mul(Fraction frac){
		Fraction r = new Fraction(numerator * frac.numerator, denominator * frac.denominator);
		return r;
	
	}
	
	public Fraction div(Fraction frac){
		Fraction r = new Fraction(numerator / frac.numerator, denominator / frac.denominator);
		return r;
	
	}
	
	public String toString(){
		String str = new String();
		return str = Integer.toString(numerator) + Integer.toString(denominator);
		
	}
	
	public void print(){
		System.out.println("Числитель: " + this.numerator);
		System.out.println("Знаменатель: " + this.denominator);
	}
	

}
