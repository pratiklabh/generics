package com.sts.generics.test;

class Test1<T> {
    T obj;
    
    // constructor
    Test1(T obj) { 
        this.obj = obj; 
    }
    
    public T getObject() { 
        return this.obj; 
    }
}
 
