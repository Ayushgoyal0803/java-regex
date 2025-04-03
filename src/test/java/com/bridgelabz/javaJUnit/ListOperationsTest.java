package com.bridgelabz.javaJUnit;

import junit.framework.TestCase;
import org.junit.jupiter.api.*;

import java.util.*;

public class ListOperationsTest extends TestCase {
    private ListOperations op= new ListOperations();
    private List<Integer> list1 = new LinkedList<>();


    @Test
    void shouldAddElementToList() {
        op.addElement(list1,5);
        assertEquals(1, list1.size());
        assertTrue(list1.contains(5));
    }

    @Test
    void shouldRemoveElementFromList() {
        op.removeElement(list1,5);
        assertFalse(list1.contains(5));
    }

    @Test
    void shouldGetSizeOfList() {
        assertEquals(list1.size(),op.getSize(list1));
    }


}