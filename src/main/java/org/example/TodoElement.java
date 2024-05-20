package org.example;

public class TodoElement {
    private String todoContent;

    public TodoElement(String todoContent) {
        this.todoContent = todoContent;
    }

    @Override
    public String toString() {
        return todoContent;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }
}
