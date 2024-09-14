package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Predicate;


/**
 * Реализация базовой структуры односвязного списка
 * При необходимости, можно доработать реализацию
 *
 * @param <T>
 */
@Getter
@Setter
public class Node<T> implements Iterable<T>{

    private T value;

    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public Node<T> add(T value) {
        Node<T> emptyNode = this;
        while (emptyNode.getNext() != null) {
            emptyNode = emptyNode.getNext();
        }
        Node<T> newNode = new Node<>(value);
        emptyNode.setNext(newNode);
        return newNode;
    }

    @Override
    public Iterator<T> iterator() {
        return new NodeIterator<>(this);
    }

    private static class NodeIterator<T> implements Iterator<T>{
        private Node<T> current;

        public NodeIterator(Node<T> startNode) {
            this.current = startNode;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            T value = current.getValue();
            current = current.getNext();
            return value;
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            while (hasNext()){
                action.accept(next());
            }
        }
    }
}
