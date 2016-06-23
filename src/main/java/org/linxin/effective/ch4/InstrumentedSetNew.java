package org.linxin.effective.ch4;

import java.util.Collection;
import java.util.Set;

/**
 * Created by linxing on 20/06/2016.
 */
// Wrapper class - uses composition in place of inheritance
public class InstrumentedSetNew<E> extends ForwardingSet<E> {
    private int addCount = 0;
    public InstrumentedSetNew(Set<E> s) {
        super(s);
    }
    @Override public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    @Override public boolean addAll(Collection<? extends E> c) { addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }
}
