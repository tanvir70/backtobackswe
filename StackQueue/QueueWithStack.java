package swe.StackQueue;

import java.util.Stack;

public class QueueWithStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enQueue(int item) {
        stack1.push(item);
    }

    public int deQueue() {
        helper();
        return stack2.pop();
    }

    public int helper() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.empty();
    }
}
