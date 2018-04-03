package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        ArrayList<String> arrayList = new ArrayList<String>();
        strings = new ArrayList<String>();
        int temp = 0;// position = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(i, reader.readLine());

            if (strings.get(i).length() > temp) {
                temp = strings.get(i).length();
//                position = i;
            }
        }

        for (int i = 0; i <strings.size() ; i++) {
            if (temp == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }

    }
}
