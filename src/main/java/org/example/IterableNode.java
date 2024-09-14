package org.example;

import java.util.Iterator;


public class IterableNode<T> implements Iterable<T> {

    private final Node<T> head;

    public IterableNode(Node<T> value) {
        head = value;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    T data = current.getValue();
                    current = current.getNext();
                    return data;
                }
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove not implemented.");
            }

        };

    }

}
