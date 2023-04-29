package swe.StackQueue;

import java.util.Stack;

public class TextEditorTwo {

    private String currentState;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditorTwo() {
        currentState = "";
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    private void insert(char c) {
        undoStack.push(currentState);
        currentState += c;
        redoStack.clear();
    }

    private void delete() {
        if (!currentState.isEmpty()) {
            undoStack.push(currentState);
            currentState = currentState.substring(0, currentState.length() - 1);
            redoStack.clear();
        }
    }

    private void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentState);
            currentState = undoStack.pop();
        }
    }

    private void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentState);
            currentState = redoStack.pop();
        }
    }

    public static void main(String[] args) {
        TextEditorTwo tx = new TextEditorTwo();
        tx.insert('H');
        tx.insert('e');
        tx.insert('l');
        tx.insert('l');
        tx.insert('o');
        tx.insert('w');
        System.out.println(tx.currentState); //Hellow

        tx.undo();
        System.out.println(tx.currentState); //Hello

        tx.delete();
        System.out.println(tx.currentState); //Hell

        tx.undo();
        System.out.println(tx.currentState); //Hello

        tx.redo();
        System.out.println(tx.currentState); //Hell

    }
}


