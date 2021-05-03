package com.digitalskola;

enum Colors {
    RED("#ff0000"),
    BLUE("#3366cc"),
    BLACK("#000000");

    String hexValue;

    Colors(String hexValue) {
        this.hexValue = hexValue;
    }

    String getHexValue() {
        return hexValue;
    }
}

public class ContohEnum {
    public static void main(String[] args) {
        String hexBiru = Colors.BLUE.getHexValue();
        System.out.println("Hex dari Biru adalah: " + hexBiru);
    }
}