package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<String>();
        int max = 0, min = 0;

        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
            //int temp = arrayList.get(i).length();
//            if (arrayList.get(i).length() > max) max = arrayList.get(i).length();
//            if (arrayList.get(i).length() < min) min = arrayList.get(i).length();
        }

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(max).length() < arrayList.get(i).length()) {
                max = i;
            }
            if (arrayList.get(min).length() > arrayList.get(i).length()) {
                min = i;
            }
        }
        if (max < min) {
            System.out.println(arrayList.get(max));
        } else
            System.out.println(arrayList.get(min));

//        System.out.println(max + " " + min);

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
    }
}
