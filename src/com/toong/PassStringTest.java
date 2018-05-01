package com.toong;

public class PassStringTest {

    public static void main(String[] args) {
        String f = "a";
        modify(f);
        System.out.println(f);
    }

    public static void modify(String s) {
        s = "b"; // it will not change the f variable in main (caller method), because when set s = "b", in memory, it will create "b" then the copy of s will point to "b"
    }
}
