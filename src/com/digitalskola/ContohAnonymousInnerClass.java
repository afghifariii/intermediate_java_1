package com.digitalskola;

interface Animal {
    void eat();
}

class ContohAnonymousInnerClass {
    public static void main(String args[]){

        Animal a = new Animal() {
            public void eat() { System.out.println("eat dari anonymous inner class"); }
        };
        a.eat();

        Animal b = () -> System.out.println("eat dari lambda");
        b.eat();
    }
}