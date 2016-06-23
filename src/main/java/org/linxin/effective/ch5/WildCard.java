package org.linxin.effective.ch5;

import java.util.Collection;

import static jdk.nashorn.internal.objects.NativeArray.push;

/**
 * Created by linxing on 22/06/2016.
 */
public class WildCard<E> {


    // Wildcard type for parameter that serves as an E producer
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src)
            push(e);
    }


    // Wildcard type for parameter that serves as an E consumer
    public void popAll(Collection<? super E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }


    private E pop() {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }
}
