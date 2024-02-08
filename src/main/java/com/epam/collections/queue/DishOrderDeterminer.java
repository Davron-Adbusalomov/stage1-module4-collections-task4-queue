package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();

        // Create a queue to represent the order of dishes
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        // Simulate eating dishes according to the rules
        while (!queue.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                // Remove and add the dish back to simulate skipping dishes
                int skippedDish = queue.poll();
                queue.add(skippedDish);
            }

            // Add the dish to the result list when eaten
            result.add(queue.poll());
        }
        return result;
    }
}
