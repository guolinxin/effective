package org.linxin.effective.ch2;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by linxing on 15/06/2016.
 */
public class WeakHashMapTest {
    static Map wMap = new WeakHashMap();

    public static void testWeakHashMap() {

        String first = "first";
        String second = "second";
        wMap.put(first, "doing");
        wMap.put(second, "job");

        System.out.println("first get:" + wMap.get(first));
        System.out.println("first get:" + wMap.get(second));
        first = null;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println("next get:" + wMap.get(first));
        System.out.println("next get:" + wMap.get(second));
    }

    public static void main(String[] args) {
        testWeakHashMap();
    }
}
