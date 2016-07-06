package ds.home.BDD;

import org.apache.commons.math3.fraction.Fraction;

public class ComputingClass {

    FractionFactory ff = new FractionFactory();
	
	Fraction fraction1;
	Fraction fraction2;
	
    /**
     * @param st1
     * @param st2
     */
    ComputingClass(String st1, String st2) {
        super();
        this.fraction1 = ff.createFraction(st1);
        this.fraction2 = ff.createFraction(st2);
    }

	/**
	 * @param int1
	 * @param int2
	 */
	ComputingClass(int int1, int int2) {
		super();
        this.fraction1 = ff.createFraction(int1);
        this.fraction2 = ff.createFraction(int2);
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
