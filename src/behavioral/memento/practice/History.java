package behavioral.memento.practice;

import java.util.Stack;

public class History {
    private Stack<DocumentState> stack = new Stack<>();

    public void push(DocumentState documentState) {
        stack.push(documentState);
    }

    public DocumentState pop() {
        return stack.pop();
    }
}
