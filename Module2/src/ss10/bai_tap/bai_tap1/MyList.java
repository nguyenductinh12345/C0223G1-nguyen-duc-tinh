package ss10.bai_tap.bai_tap1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {

        elements = new Object[DEFAULT_CAPACITY];
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index :" + index + ",size" + index);
        }
        return (E) elements[index];
    }

    public boolean add(E e) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size++] = e;
        return true;
    }

    public boolean remove(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                int numMoved = size - i - 1;
                if (numMoved > 0) {
                    System.arraycopy(elements, i + 1, elements, i, numMoved);
                }
                elements[--size] = null;
                return true;

            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
