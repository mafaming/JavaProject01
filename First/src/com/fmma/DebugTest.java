package com.fmma;

import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "30");

        System.out.println(map.get("age"));
    }
}
