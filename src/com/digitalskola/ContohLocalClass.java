package com.digitalskola;

class ContohLocalClass{
    int n = 5;

    void result(){
        // Local inner class
        class Cube {
            int calc() {
                return n*n*n;
            }
        }

        Cube c = new Cube();
        System.out.println(c.calc());
    }

    public static void main(String args[]) {
        ContohLocalClass lc = new ContohLocalClass();
        lc.result();
    }
}
