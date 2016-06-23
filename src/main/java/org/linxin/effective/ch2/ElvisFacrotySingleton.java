package org.linxin.effective.ch2;

/**
 * Created by linxing on 13/06/2016.
 */

// Singleton with static factory
public class ElvisFacrotySingleton {
    private static final ElvisFacrotySingleton INSTANCE = new ElvisFacrotySingleton();

    private ElvisFacrotySingleton() {
        System.out.println("Elvis");
    }

    public static ElvisFacrotySingleton getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("leavethe building");
    }
}
