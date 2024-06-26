package test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestArr  {
    Arrayimple list;

    @Before
    public void setUp() {
        list = new Arrayimple();
    }

    @Test
    public void testAddAndGet() {
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size());
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        list.add(10);
        list.add(20);
        list.get(2);
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.add(10);
        list.add(20);
        assertEquals(2, list.size());
    }
}

