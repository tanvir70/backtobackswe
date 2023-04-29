package swe.StackQueue;

import java.util.Stack;

class Action {
    Character character;
    ActionType type;

    public Action(ActionType type) {
        this.type = type;
    }

    public Action(ActionType type, Character character) {
        this.character = character;
        this.type = type;
    }

    public Character getCharacter() {
        return character;
    }

    public ActionType getType() {
        return type;
    }
}

enum ActionType {
    INSERT,
    DELETE,
    UNDO,
    REDO
}

public class TextEditor {
    private String currentState;
    private Stack<Action> undo;
    private Stack<Action> redo;

    public TextEditor() {
        currentState = "";
        undo = new Stack<>();
        redo = new Stack<>();

    }

    public String performEditorAction(Action type) {
        switch (type.getType()) {
            case INSERT -> {
                insert(type.getCharacter());
                break;
            }
            case DELETE -> {
                delete();
                break;
            }
            case REDO -> {
                redo();
                break;
            }
            case UNDO -> {
                undo();
                break;
            }
        }
        return currentState;
    }

    private void insert(char c) {
        undo.push(new Action(ActionType.DELETE));
        currentState += c;
        redo.clear();
    }

    private void delete() {
        if (!currentState.isEmpty()) {
            undo.push(new Action(ActionType.INSERT, currentState.charAt(currentState.length() - 1)));
            currentState = currentState.substring(0, currentState.length() - 1);
            redo.clear();
        }
    }

    private void undo() {
        if (!undo.isEmpty()) {
            Action lastAction = undo.pop();
            redo.push(lastAction);
            switch (lastAction.getType()) {
                case INSERT -> {
                    delete();
                    break;
                }
                case DELETE -> {
                    insert(lastAction.getCharacter());
                    break;
                }
            }
        }
    }

    private void redo() {
        if (!redo.isEmpty()) {
            Action lastAction = redo.pop();
            undo.push(lastAction);
            switch (lastAction.getType()) {
                case INSERT -> {
                    insert(lastAction.getCharacter());
                    break;
                }
                case DELETE -> {
                    delete();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.performEditorAction(new Action(ActionType.INSERT,'H'));
        textEditor.performEditorAction(new Action(ActionType.INSERT,'e'));
        textEditor.performEditorAction(new Action(ActionType.INSERT,'l'));
        textEditor.performEditorAction(new Action(ActionType.INSERT,'l'));
        textEditor.performEditorAction(new Action(ActionType.INSERT,'o'));
        textEditor.performEditorAction(new Action(ActionType.INSERT,'H'));
        textEditor.performEditorAction(new Action(ActionType.DELETE));
        System.out.println(textEditor.currentState);
        textEditor.performEditorAction(new Action(ActionType.REDO));
        System.out.println(textEditor.currentState);
    }
}
