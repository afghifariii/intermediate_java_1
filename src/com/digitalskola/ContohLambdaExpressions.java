package com.digitalskola;

interface Vehicle {
    void maju();
}

class ContohLambdaExpressions {
    public static void main(String args[]){

        Vehicle v = () -> System.out.println("Kendaraan Maju");
        v.maju();
    }
}
