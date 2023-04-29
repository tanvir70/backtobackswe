package swe.StackQueue;

import java.util.Stack;

public class StackSequence {
    public boolean validStackSequence(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num:pushed){
            stack.push(num);
            while (!stack.isEmpty() &&
                    i < popped.length &&
                    stack.peek().equals(popped[i])) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
