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
        int max = 0, min = 9999999;

        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
            //int temp = arrayList.get(i).length();
            if (arrayList.get(i).length() > max) max = arrayList.get(i).length();
            if (arrayList.get(i).length() < min) min = arrayList.get(i).length();
        }

//        System.out.println(max + " " + min);

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
    }
}
