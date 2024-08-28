package com.sts.generics.test;

public class Test3 {

    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                           + " = " + element);
    }
 
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(10);
 
        // Calling generic method with String argument
        genericDisplay("Pratik");
 
        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}
