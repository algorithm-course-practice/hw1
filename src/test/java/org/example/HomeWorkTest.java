package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @Test
    void partitionBy() {
        Node<Integer> node = new Node<>(0);
        for (int i = 1; i <= 10; i++) {
            node.add(i);
        }
        HomeWork hm = new HomeWork();

        assertEquals(0, hm.partitionBy(node, x -> x < 0));
        assertEquals(1, hm.partitionBy(node, x -> x < 1));
        assertEquals(2, hm.partitionBy(node, x -> x < 2));
        assertEquals(3, hm.partitionBy(node, x -> x < 3));
        assertEquals(4, hm.partitionBy(node, x -> x < 4));
        assertEquals(5, hm.partitionBy(node, x -> x < 5));
        assertEquals(6, hm.partitionBy(node, x -> x < 6));
        assertEquals(7, hm.partitionBy(node, x -> x < 7));
        assertEquals(8, hm.partitionBy(node, x -> x < 8));
        assertEquals(9, hm.partitionBy(node, x -> x < 9));
        assertEquals(10, hm.partitionBy(node, x -> x < 10));
        Node<Integer> nodeException = new Node<>(null);
        assertThrows(IllegalArgumentException.class, () -> hm.partitionBy(nodeException, x -> x > 1));
        Node<Integer> nodeException2 = null;
        assertThrows(IllegalArgumentException.class, () -> hm.partitionBy(nodeException2, x -> x > 1));

    }

    @Test
    void findNthElement() {
        Node<Integer> node = new Node<>(0);
        for (int i = 1; i <= 10; i++) {
            node.add(i);
        }
        HomeWork hm = new HomeWork();

        assertEquals(0, hm.findNthElement(node, 0));
        assertEquals(1, hm.findNthElement(node, 1));
        assertEquals(2, hm.findNthElement(node, 2));
        assertEquals(3, hm.findNthElement(node, 3));
        assertEquals(4, hm.findNthElement(node, 4));
        assertEquals(5, hm.findNthElement(node, 5));
        assertEquals(6, hm.findNthElement(node, 6));
        assertEquals(7, hm.findNthElement(node, 7));
        assertEquals(8, hm.findNthElement(node, 8));
        assertEquals(9, hm.findNthElement(node, 9));
        assertEquals(10, hm.findNthElement(node, 10));
        Node<Integer> nodeException = new Node<>(null);
        assertThrows(IllegalArgumentException.class, () -> hm.findNthElement(nodeException, 4));
        Node<Integer> nodeException2 = null;
        assertThrows(IllegalArgumentException.class, () -> hm.findNthElement(nodeException2, 1));
    }
}