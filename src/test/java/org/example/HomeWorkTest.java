package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    private final HomeWork homeWork = new HomeWork();

    @Test
    void partitionByInt() {

        List<Integer> expectedList = new ArrayList<>();

        Node<Integer> head = new Node<>(0);
        expectedList.add(0);
        for (int i = 1; i < 10; i++) {
            head.add(i);
            expectedList.add(i);
        }
        Predicate<Integer> predicate = i -> i < 5;
        int count = (int) expectedList.stream().filter(predicate).count();
        int i = homeWork.partitionBy(head, predicate);
        assertEquals(count, i);

    }

    @Test
    void partitionByString() {

        List<String> expectedList = List.of(
                "one",
                "two",
                "three",
                "4",
                "5",
                "Six"
        );
        Node<String> head = new Node<>("one");
        expectedList.stream().skip(1).forEach(head::add);
        Predicate<String> pred = (String s) -> s.length() > 4;
        int count = (int) expectedList.stream().filter(pred).count();
        int result = homeWork.partitionBy(head, pred);
        assertEquals(count, result);
    }

    @Test
    void partitionByExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> homeWork.partitionBy(new Node<>(1), null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> homeWork.partitionBy(null, (Boolean b) -> true));
    }

    @Test
    void findNthElementExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> homeWork.findNthElement(null, 2));
        assertThrows(IllegalArgumentException.class, () -> homeWork.findNthElement(new Node<>(2), -1));
        assertThrows(IllegalArgumentException.class, () -> homeWork.findNthElement(new Node<>(2), 3));
    }

    @Test
    void findNthElementTest() {
        Node<Integer> head = new Node<>(0);
        IntStream.range(1,10).forEach(head::add);
        assertEquals(4, homeWork.findNthElement(head, 4));
        assertNotEquals(4, homeWork.findNthElement(head, 5));
        assertNotEquals(4, homeWork.findNthElement(head, 3));
    }
}