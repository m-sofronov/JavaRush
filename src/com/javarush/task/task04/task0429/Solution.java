package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      //  int     num1 = Integer.parseInt(reader.readLine()),
        //        num2 = Integer.parseInt(reader.readLine()),
          //      num3 = Integer.parseInt(reader.readLine());
        int plus = 0;
        int minus = 0;
        //int[] numbers = new int[3];

//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(reader.readLine());
//            if (numbers[i] > 0) plus++;
//            if (numbers[i] < 0) minus++;
//        }

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > 0) plus ++;
            if (num < 0) minus ++;
        }
        
        System.out.println("количество положительных чисел: " + plus);
        System.out.println("количество отрицательных чисел: " + minus);
    }
}
