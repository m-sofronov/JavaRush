package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int number = Integer.parseInt(sNumber);
        if (number > 0) {
            number *= 2;
            System.out.println(number);
        } else if (number < 0) {
            number++;
            System.out.println(number);
        } else System.out.println(number);

    }

}