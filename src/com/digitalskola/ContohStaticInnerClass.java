package com.digitalskola;

class OuterClass {
    static String name = "Ali";

    static class NestedStaticClass {
        public void print() {
            System.out.println("Message from nested static class");
            System.out.println(name);
        }
    }
}

public class ContohStaticInnerClass {
    public static void main(String args[]){
        OuterClass.NestedStaticClass sc = new OuterClass.NestedStaticClass();
        sc.print();
    }
}