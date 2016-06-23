package org.linxin.effective.ch4;

import static org.linxin.effective.ch4.PhysicalConstants.AVOGADROS_NUMBER;

/**
 * Created by linxing on 21/06/2016.
 */ //  example: Use of static import to avoid qualifying constants
public class Test {
    double atoms(double mols) {
        return AVOGADROS_NUMBER * mols;
    }

// Many more uses of PhysicalConstants justify static import
}
