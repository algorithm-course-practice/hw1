package org.example;

import java.util.function.Predicate;

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
        int count = 0;
        Node<T> currentNode = list;
        while (currentNode != null) {
            if (!pred.test(currentNode.getValue())) {
                break; // условие вернуло false, прекращаем подсчет
            }
            count++;
            currentNode = currentNode.getNext();
        }

        return count;
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
        int index = 0;
        Node<T> currentNode = list;

        // Проходим по списку, пока не достигнем N-го элемента
        while (currentNode != null) {
            if (index == n) {
                return currentNode.getValue(); // Возвращаем значение на позиции N
            }
            index++;
            currentNode = currentNode.getNext();
        }

        // Если список короче, чем N элементов, возвращаем null
        return null;
    }

    public static void main(String[] args) {

    }

}
