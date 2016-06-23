package org.linxin.effective.ch2;

/**
 * Created by linxing on 13/06/2016.
 */

// Enum singleton - the preferred approach
public enum ElvisSingleton {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Enum");
    }
}