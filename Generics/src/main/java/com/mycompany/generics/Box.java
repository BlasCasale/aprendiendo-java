package com.mycompany.generics;

public class Box<T> {

    private T content;

    public Box(T content) {
        this.content = content;
    }

    public Box() {
    }

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return this.content;
    }
}
