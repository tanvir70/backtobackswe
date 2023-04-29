package swe.StackQueue;

import java.util.Arrays;
import java.util.Collections;

public class CircularQueue {
    private int head = 0, tail = 0, size = 0;
    private static final int scale = 2;

    public int[] queue;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
    }

    public void inQueue(int x) {
        if (size == queue.length) {
            resize();
        }
        queue[tail] = x;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public int deQueue() throws NoSuchFieldException {
        if (size == 0) {
            throw new NoSuchFieldException("Queue is Empty .");
        }
        int deQueueValue = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return deQueueValue;
    }

    private void resize() {
        Collections.rotate(Arrays.asList(queue), -head);
        head = 0;
        tail = size;
        queue = Arrays.copyOf(queue, size * scale);
    }
}
