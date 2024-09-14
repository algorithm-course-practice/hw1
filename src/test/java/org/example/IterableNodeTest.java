package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IterableNodeTest {

    @Test
    void iterator() {

        List<Integer> expectedList = new ArrayList<>();

        Node<Integer> head = new Node<>(0);
        expectedList.add(0);
        for (int i = 1; i < 10; i++) {
            head.add(i);
            expectedList.add(i);
        }
        Node<Integer> current = head;
        int size = 0;
        while (current != null) {
            assertEquals(expectedList.get(size), current.getValue());
            size++;
            current = current.getNext();
        }
        assertEquals(expectedList.size(), size);

        IterableNode<Integer> listNodes = new IterableNode<>(head);
        int i = 0;
        for (Integer node : listNodes) {
            assertEquals(expectedList.get(i), node);
            i++;
        }
        i = 0;
        for (Integer node : listNodes) {
            assertEquals(expectedList.get(i), node);
            i++;
        }
    }
}