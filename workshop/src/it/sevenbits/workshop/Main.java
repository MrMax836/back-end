package it.sevenbits.workshop;

import it.sevenbits.workshop.matrix.Matrix;
import it.sevenbits.workshop.queue.DoubleEndedQueue;

public class Main {
    public static void main(String[] args) {
        // Workshop
//        Matrix matrix = new Matrix(3, 4);
//        System.out.println(matrix.toString());
//        matrix.inverseMatrix();
//        System.out.println((matrix));

//        Matrix commandArgs = new Matrix(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
//        System.out.println("Matrix with command args: " + commandArgs);

        // Tasks
        DoubleEndedQueue queue = new DoubleEndedQueue();
        Matrix m1 = new Matrix(3, 4);
        Matrix m2 = new Matrix(4, 3);
        Matrix m3 = new Matrix(5, 2);
        queue.addFirst(m1);
        queue.addLast(m2);
        queue.addLast(m3);
        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());
        System.out.println(queue);
    }
}
