package org.linxin.effective.ch4;

/**
 * Created by linxing on 20/06/2016.
 */
// Immutable class with static factories instead of constructors
public class ComplexB {
    private final double re;
    private final double im;

    private ComplexB(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static ComplexB valueOf(double re, double im) {
        return new ComplexB(re, im);
    }
    // Remainder unchanged
}
