package com.sts.generics.test;


class Test1Main {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test1<Integer> iObj = new Test1<Integer>(10);
        System.out.println(iObj.getObject());
 
        // instance of String type
        Test1<String> sObj
            = new Test1<String>("NEPAL");
        System.out.println(sObj.getObject());
    }
}