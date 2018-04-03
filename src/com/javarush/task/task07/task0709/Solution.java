package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<String>();

        int temp = 9999999;

        for (int i = 0; i < 5; i++) {
            arrayList.add(i, reader.readLine());

            if (arrayList.get(i).length() < temp) {
                temp = arrayList.get(i).length();

            }
        }

        for (int i = 0; i <arrayList.size() ; i++) {
            if (temp == arrayList.get(i).length()) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
