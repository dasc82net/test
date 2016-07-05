package ds.home.BDD;

import org.apache.commons.math.fraction.Fraction;

public class ComputingClass {
	
	
	Fraction fraction1;
	Fraction fraction2;
	

	/**
	 * @param int1
	 * @param int2
	 */
	ComputingClass(int int1, int int2) {
		super();
		this.fraction1 = new Fraction(int1);
		this.fraction2 = new Fraction(int2);
	}
	
	
	/**
	 * @param fraction1
	 * @param fraction2
	 */
	ComputingClass(Fraction fraction1, Fraction fraction2) {
		super();
		this.fraction1 = fraction1;
		this.fraction2 = fraction2;
	}
	
	Fraction add(){
		return fraction1.add(fraction2);
	}
	
	
}
