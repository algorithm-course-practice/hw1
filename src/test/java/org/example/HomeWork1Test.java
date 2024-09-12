package org.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class HomeWork1Test {

    @Test
    public void test1(){
        Node <Integer> node = new Node<>(1);
        for (int i = 2; i < 5; i++){
            node.add(i);
        }
        Predicate<Integer> pred = i -> i < 4;
        HomeWork homeWork = new HomeWork();
        System.out.println(homeWork.partitionBy(node, pred));
        System.out.println(homeWork.findNthElement(node, 3));

        pred = i -> i < 0;
        System.out.println(homeWork.partitionBy(node, pred));
        System.out.println(homeWork.findNthElement(node, 0));
    }

}
