package com.digitalskola;

final class Employee {
    final String name;

    final void bekerja() {
        System.out.println("Employee sedang bekerja");
    }

    Employee(final String name) {
        this.name = name;
    }
}