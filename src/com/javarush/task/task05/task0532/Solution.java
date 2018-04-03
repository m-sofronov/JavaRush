package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = -99999999;
        int temp = 0;

        //напишите тут ваш код
       // System.out.println("Укажите количество чисел:");
        int N = Integer.parseInt(reader.readLine());
       // System.out.println("Введите числа:");

        for (int i = 0; i < N; i++) {
            temp = Integer.parseInt(reader.readLine());
            if (i == 0) maximum = temp;
            else if (temp > maximum) maximum = temp;
        }

        System.out.println(maximum);
    }
}
