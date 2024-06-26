package test;



import java.util.Arrays;

public class Arrayimple {
    int[] array;
    int size;

    public Arrayimple() {
        this.array = new int[10];
        this.size = 0;
    }

    public void add(int v) {
        ensureCapacity();
        array[size++] = v;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }

    public int size() {
        return size;
    }
}

 
