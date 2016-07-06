/*
 * Creation : 6 juil. 2016
 */
package ds.home.BDD;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionFormat;

public class FractionFactory {

    Fraction createFraction(String s) {
        return FractionFormat.getProperInstance().parse(s);
    }

    Fraction createFraction(int i) {
        return new Fraction(i);
    }

    Fraction createFraction(int up, int down) {
        return new Fraction(up, down);
    }
}
