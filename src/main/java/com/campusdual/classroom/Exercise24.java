package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> surname = new LinkedList<>();
        surname.offer("Smith");
        surname.offer("Montessori");
        surname.offer("Peralta");
        surname.offer("House");

        return surname;

    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        for(String element : queue) {
            while(!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = createQueue();
        printAndEmptyQueue(queue);

    }

}
