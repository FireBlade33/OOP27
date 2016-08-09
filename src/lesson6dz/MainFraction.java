package lesson6dz;

public class MainFraction {

	public static void main(String[] args) {
		Fraction frac = new Fraction(10, 20);
		Fraction frac2 = new Fraction(5, 10);
		
		Fraction res = frac.add(frac2);
		System.out.println(res);
		frac.sub(frac2);
		frac.div(frac2);
		frac.mul(frac2);
		frac.toString();
		frac2.toString();
		frac.print();
		frac2.print();

	}

}
