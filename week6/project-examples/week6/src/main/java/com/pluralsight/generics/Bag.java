package com.pluralsight.generics;

public class Bag<T> {
    T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
