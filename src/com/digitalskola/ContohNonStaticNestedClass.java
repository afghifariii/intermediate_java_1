package com.digitalskola;

class OuterNonStaticClass {
    String name = "Ali";

    class NestedClass {
        public void print() {
            System.out.println("Message from non static nested class");
            System.out.println("Halo " + name);
        }
    }
}

public class ContohNonStaticNestedClass {
    public static void main(String args[]){
        OuterNonStaticClass oc = new OuterNonStaticClass();
        OuterNonStaticClass.NestedClass sc = oc.new NestedClass();
        sc.print();
    }
}
