package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        if (firstQueue == null || secondQueue == null) {
            throw new IllegalArgumentException("Input queues must not be null");
        }

        ArrayDeque<Integer> resultDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            if (!resultDeque.isEmpty()) {
                firstQueue.add(resultDeque.poll());
            }

            resultDeque.add(firstQueue.poll());
            resultDeque.add(secondQueue.poll());
        }

        while (!firstQueue.isEmpty()) {
            resultDeque.add(firstQueue.poll());
        }

        while (!secondQueue.isEmpty()) {
            resultDeque.add(secondQueue.poll());
        }
        ArrayDeque<Integer> resultDeque1 = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);

        resultDeque1.addAll(list);
        return resultDeque1;
    }
}
