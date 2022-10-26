package ss10_DSA_DS.Th1_SimpleList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

//    Tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCap() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
//        Ý nghĩa của dòng lệnh này là gì??
    }

    public void add(E e) {
        if(size == elements.length) {
            ensureCap();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size" + i );
        }
        return (E) elements[i];
    }
}
