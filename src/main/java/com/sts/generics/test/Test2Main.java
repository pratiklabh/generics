package com.sts.generics.test;

public class Test2Main {
    public static void main (String[] args)
    {
        Test2 <String, Integer> obj =
            new Test2<>("Pratik", 10);
 
        obj.print();
        
        Test2<Integer, String> obj2 =
                new Test2<>(10, "Messi");
        
        obj2.print();
    }
}
