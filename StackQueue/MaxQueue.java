package swe.StackQueue;

import java.util.*;
public class MaxQueue {
    private Queue<Integer> queue;
    private Deque<Integer> maxDeque;

    public MaxQueue() {
        queue = new LinkedList<>();
        maxDeque = new LinkedList<>();
    }

    public void enqueue(int x) {
        queue.offer(x);

        while (!maxDeque.isEmpty() && maxDeque.peekLast() < x) {
            maxDeque.pollLast();
        }
        maxDeque.offerLast(x);
    }

    public Integer dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        if (queue.peek().equals(maxDeque.peekFirst())) {
            maxDeque.pollFirst();
        }
        return queue.poll();
    }
    public Integer max() {
        if (maxDeque.isEmpty()) {
            return null;
        }
        return maxDeque.peekFirst();
    }
}
