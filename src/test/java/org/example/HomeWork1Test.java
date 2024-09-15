package org.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeWork1Test {

    @Test
    public void test1(){
        Node <Integer> node = new Node<>(1);
        for (int i = 2; i < 5; i++){
            node.add(i);
        }
        Predicate<Integer> pred = i -> i < 4;
        HomeWork homeWork = new HomeWork();
        assertEquals(homeWork.partitionBy(node, pred), 3);
        assertEquals(homeWork.findNthElement(node, 3), 4);
        assertEquals(homeWork.findNthElement(node, 0), 1);

        pred = i -> i < 0;
        assertEquals(homeWork.partitionBy(node, pred), 0);
        node = null;
        assertEquals(homeWork.partitionBy(node, pred), 0);
        assertEquals(homeWork.findNthElement(node, 10), null);
        assertEquals(homeWork.findNthElement(node, -30), null);
        assertEquals(homeWork.findNthElement(node, 0), null);
    }
}
