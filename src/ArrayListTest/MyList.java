package ArrayListTest;

public interface MyList<E> extends java.lang.Iterable<E> {
    void add(E e);

    void add(int index, E e);

    boolean contains(E e);

    E get(int index);

    int indexOf(E e);

    boolean isEmpty();

    void clear();

    int lastIndexOf(E e);

    boolean remove(E e);

    E remove(int index);

    Object set(int index, E e);

    int size();
}

