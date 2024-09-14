package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeWorkTest {

    @Test
    void partitionByIntegerTypeTest() {
        //given
        HomeWork integerTest = new HomeWork();
        //when
        Node<Integer> integerList = new Node<>(1);
        integerList
                .add(2)
                .add(3)
                .add(4)
                .add(5);
        //then
        Assertions.assertEquals(2, integerTest.partitionBy(integerList, x -> x > 3));
    }

    @Test
    void partitionByStringTypeTest() {
        //given
        HomeWork stringTest = new HomeWork();
        //then
        Node<String> stringList = new Node<>("agu");
        stringList
                .add("abc")
                .add("abf")
                .add("bas")
                .add("cag")
                .add("acg");
        //when
        Assertions.assertEquals(2, stringTest.partitionBy(stringList, x -> x.contains("ab")));
    }

    @Test
    void findNthElement() {
        //given
        HomeWork integerTest = new HomeWork();
        //when
        Node<Integer> integerList = new Node<>(0);
        integerList
                .add(1)
                .add(2)
                .add(3)
                .add(4);
        //then
        Assertions.assertEquals(0, integerTest.findNthElement(integerList, 0));
        Assertions.assertEquals(1, integerTest.findNthElement(integerList, 1));
        Assertions.assertEquals(2, integerTest.findNthElement(integerList, 2));
        Assertions.assertEquals(3, integerTest.findNthElement(integerList, 3));
        Assertions.assertEquals(4, integerTest.findNthElement(integerList, 4));
        Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> integerTest.findNthElement(integerList, 5));
    }
}