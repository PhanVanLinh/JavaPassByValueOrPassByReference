package com.toong;

public class PassArrayTest {

    public static void changeReference(int[] arr) {
        // If we change the reference
        arr = new int[2];  // Will not change the array in main()
        arr[0] = 3;
    }

    public static void changeContent(int[] arr) {
        // If we change the content of arr.
        arr[0] = 10;  // Will change the content of array in main()
    }

    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        changeReference(arr);
        System.out.println(arr[0]);  // Will still print 1 (not print 3)

        changeContent(arr);
        System.out.println(arr[0]);  // Will print 10..
    }
}
