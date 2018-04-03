package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayString = new String[10];
        int[] arrayInteger = new int[10];

        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = reader.readLine();
        }

        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = arrayString[i].length();
            System.out.println(arrayInteger[i]);
        }

    }
}
