package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T>{
     private ArrayList <T> stack = new ArrayList<T>();

    public boolean isEmpty() { return stack.isEmpty(); }

    public void push(T i) {
        if(stack.isEmpty()){
            stack.add(i);
        }
        else {
            stack.add(0, i);
        }

    }

    public T pop() throws EmptyStackException {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(0);
    }

    public T peek() {
        if(stack.isEmpty()){
            return null;
        }
        return stack.get(0);
    }

    public Integer size(){
        return stack.size();
    }
}
