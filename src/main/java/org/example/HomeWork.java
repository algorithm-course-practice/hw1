package org.example;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

/**
 * Сигнатуры методов в данном классе не менять
 */
public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Реализовать метод, который подсчитывает количество подходящих по условию узлов от 0 до N.
     * <br/>
     * Пример 1:
     * список 1, 2, 3, 4, 5
     * условие x < 4
     * ответ 3
     * <br/>
     * Пример 2:
     * список 1, 2, 3, 4, 5
     * условие x < 0
     * ответ 0
     *
     * @param list односвязный список
     * @param pred условие
     * @param <T>  - тип хранимых значений в списке
     * @return количество узлов от 0 до N, где N позиция на которой первый раз условие вернуло fals
     */
    public <T> int partitionBy(Node<T> list, Predicate<T> pred) {
        if(pred == null) throw new IllegalArgumentException("Predicate cannot be null");
        if(list == null) throw new IllegalArgumentException("List cannot be null");
        IterableNode<T> nodes = new IterableNode<>(list);
        return (int) StreamSupport.stream(nodes.spliterator(), false).filter(pred).count();

    }

    /**
     * <h1>Задание 2.</h1>
     * Реализовать метод поиска элемента на позиции N в переданном односвязном списке.
     *
     * @param list односвязный список
     * @param n    позиция искомого элемента
     * @param <T>
     * @return сам элемент
     */
    public <T> T findNthElement(Node<T> list, int n) {
        if(list == null) throw new IllegalArgumentException("List cannot be null");
        if(n <= 0) throw new IllegalArgumentException("N must be greater than 0");
        IterableNode<T> iterableNode = new IterableNode<>(list);
        Optional<T> any = StreamSupport.stream(iterableNode.spliterator(), false).skip(n).findAny();
        return any.orElseThrow(() -> new IllegalArgumentException("Nth element not found"));
    }
}
