package com.chinmoy.client;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArraySetTest {

    private ArraySet set;

    @Before
    public void setUp() {
        set = new ArraySet(3);
        set.add("a");
        set.add("1234");
        set.add("c");
    }

    @Test
    public void testAddNonDuplicate() {
        assertEquals(3, set.add("d"));
        assertEquals(4, set.add(123));
        assertEquals(5, set.add(true));
    }

    @Test
    public void testAddDuplicate() {
        assertEquals(-1, set.add("a"));
        assertEquals(-1, set.add(1234));
        //assertEquals(-1, set.add(true));
    }

    @Test(expected = NullPointerException.class)
    public void testAddNull() {
        set.add(null);
    }

    @Test
    public void testRemoveExisting() {
        set.remove("a");
        assertEquals(2, set.add("d"));
    }

    @Test
    public void testRemoveNonExisting() {
        set.remove("d");
        assertEquals(3, set.add("d"));
    }

    @Test
    public void testRemoveNull() {
        set.remove(null);
    }

    @Test
    public void testShowAll() {
        set.showAll();
    }

}