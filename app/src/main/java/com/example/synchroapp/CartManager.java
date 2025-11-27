package com.example.synchroapp;

public class CartManager {
    private static int count = 0;

    public static void addItem() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void clear() {
        count = 0;
    }
}
