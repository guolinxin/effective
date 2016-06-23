package org.linxin.effective.ch5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by linxing on 22/06/2016.
 */
public class GenericMethod {

    // Sample program to exercise generic singleton
    public static void main(String[] args) {

        // Parameterized type instance creation with static factory
        Map<String, List<String>> anagrams = newHashMap();


        String[] strings = {"jute", "hemp", "nylon"};
        UnaryFunction<String> sameString = identityFunction();
        for (String s : strings)
            System.out.println(sameString.apply(s));
        Number[] numbers = {1, 2.0, 3L};
        UnaryFunction<Number> sameNumber = identityFunction();
        for (Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }


    // Generic static factory method
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    // Generic singleton factory pattern
    private static UnaryFunction<Object> IDENTITY_FUNCTION =
            new UnaryFunction<Object>() {
                public Object apply(Object arg) {
                    return arg;
                }
            };

    // IDENTITY_FUNCTION is stateless and its type parameter is
    // unbounded so it's safe to share one instance across all types.
    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

}
