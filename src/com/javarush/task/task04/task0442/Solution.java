package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int     a = 0,
                sum = 0;
//        do {
//            System.out.println("Введите число: ");
//            a = Integer.parseInt(reader.readLine());
//            sum += a;
//        } while (a != -1);

        while (a != -1) {
           // System.out.println("Введите число: ");
            a = Integer.parseInt(reader.readLine());
            sum += a;
            //System.out.println(sum);
        }

        System.out.println(sum);
    }
}
