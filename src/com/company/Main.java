package com.company;

public class Main {
    int x;  // Create a class attribute
    final int z = 4;
    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Main myObj = new Main(5);
        System.out.println(myObj.x);
    }
}
