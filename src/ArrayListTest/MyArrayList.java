package ArrayListTest;

//import java.util.ArrayList;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E> {

    private E[] array = (E[])new Object[2];
    protected int size = 0;

    public void ensureCapacity(){
        if(size >= array.length){
            E[] newArray = (E[])new Object[size * 2 + 1];
            System.arraycopy(array, 0, newArray, 0 ,size);
            array = newArray;
        }
    }

    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<String>();

        list.add("America");
        System.out.println("Hello World");
        System.out.println(list);

        list.add(1,"VN");
        System.out.println();
    }

    @Override
    public  String toString(){
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size -1 ) result.append(",");
        }
        result.append("]");
        String str = result.toString();
        return  str;
    }

    @Override
    public void add(int index, E e) {
        ensureCapacity();

        //Move the element to the right after the specified index
        for (int i = size -1; i >= index; i--) {
            array[i+1] = array[i];
        }
        array[index] = e;
        size++;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public Object set(int index, E e) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
