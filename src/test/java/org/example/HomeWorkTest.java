package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeWorkTest {

    @Test
    void partitionBy() {
        HomeWork integerTest = new HomeWork();
        Node<Integer> integerList = new Node<>(1);
        integerList
                .add(2)
                .add(3)
                .add(4)
                .add(5);
        Assertions.assertEquals(2, integerTest.partitionBy(integerList, x -> x > 3));

        HomeWork stringTest = new HomeWork();
        Node<String> stringList = new Node<>("a");
        stringList
                .add("abc")
                .add("abf")
                .add("bas")
                .add("cag")
                .add("acg");
        Assertions.assertEquals(2, stringTest.partitionBy(stringList, x -> x.contains("ab")));
    }

    @Test
    void findNthElement() {
    }
}