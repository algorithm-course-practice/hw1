package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @Test
    void partitionBy() {
        //список 1, 2, 3, 4, 5
        Node<Integer> node = new Node<>(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);
        HomeWork homeWork = new HomeWork();
        //Пример 1: условие x < 4, ожидается 3
        assertEquals(3, homeWork.partitionBy(node, x -> x < 4));
        //Пример 2: условие x < 0, ожидается 0
        assertEquals(0, homeWork.partitionBy(node, x -> x < 0));

    }

    @Test
    void findNthElement() {
        Node<Integer> node = new Node<>(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);
        HomeWork homeWork = new HomeWork();

        // Поиск элемента на позиции 2 (должно вернуть 3)
        assertEquals(3, homeWork.findNthElement(node, 2));
        // Поиск элемента на позиции 5 (в списке всего 5 элементов, индексация с 0) Ожидается null
        assertNull(homeWork.findNthElement(node, 5));

    }
}