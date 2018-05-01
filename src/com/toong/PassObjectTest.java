package com.toong;

public class PassObjectTest {

    public static void main(String[] args) {
        Foo f = new Foo("f");
        changeReference(f); // It won't change the reference!
        System.out.println(f.getTitle());
        changeContent(f); // It will modify the object that the reference variable "f" refers to!
        System.out.println(f.getTitle());
    }

    public static void changeReference(Foo a) {
        Foo b = new Foo("b");
        a = b;
        // it will not affect the f object in main (caller method)
    }

    public static void changeContent(Foo c) {
        c.setTitle("c");
    }
}
