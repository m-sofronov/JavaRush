package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);

        if (nNumber >= 1 && nNumber <= 999) {
            if (nNumber % 2 == 0 && sNumber.length() == 1) System.out.println("четное однозначное число");
            if (nNumber % 2 != 0 && sNumber.length() == 1) System.out.println("нечетное однозначное число");
            if (nNumber % 2 == 0 && sNumber.length() == 2) System.out.println("четное двузначное число");
            if (nNumber % 2 != 0 && sNumber.length() == 2) System.out.println("нечетное двузначное число");
            if (nNumber % 2 == 0 && sNumber.length() == 3) System.out.println("четное трехзначное число");
            if (nNumber % 2 != 0 && sNumber.length() == 3) System.out.println("нечетное трехзначное число");

        }
    }
}
