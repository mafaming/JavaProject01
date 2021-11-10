package com.fmma;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    private static final int AGE = 3;
    public static final int GENDER = 0;


    public static void main(String[] args) {
        System.out.printf("Hello World");

        ArrayList list = new ArrayList();

        System.out.println("HelloWorld.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {

        }
        for (Object o : list) {
            System.out.println(o);
        }
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }

        if (list == null) {

        }

    }
}
