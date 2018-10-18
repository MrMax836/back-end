package it.sevenbits.workshop.queue;

import it.sevenbits.workshop.matrix.Matrix;

public class DoubleEndedQueue {
    private Node start;
    private Node end;
    private int size;

    public DoubleEndedQueue() {
        this.start = new Node();
        this.end = new Node();
        this.start.setNext(end);
        this.end.setPrev(start);
        this.size = 0;
    }

    // What should return?
    public Matrix getFirst() {
        //return this.start.getNext();
        return this.start.getNext().getMatrix();
    }

    public Matrix getLast() {
        //return this.end.getPrev();
        return this.end.getPrev().getMatrix();
    }

    public void addFirst(Matrix m) {
        Node second = start.getNext();
        Node first = new Node(start, second, m);
        start.setNext(first);
        second.setPrev(first);
        size++;
    }

    public void addLast(Matrix m) {
        Node noLast = end.getPrev();
        Node last = new Node(noLast, end, m);
        end.setPrev(last);
        noLast.setNext(last);
        size++;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = this.start.getNext();
        for(int i = 0; i < this.size; i++) {
            sb.append("[").append(current.getMatrix().toString()).append("]");
            current = current.getNext();
        }
        return sb.toString();
    }
}