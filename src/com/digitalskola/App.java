package com.digitalskola;

class App {
    public static void main(String[] args) {
        // write your code here

        Employee pegawai = new Employee("Ali");
        pegawai.bekerja();
        System.out.println("Halo " + pegawai.name);
    }
}
