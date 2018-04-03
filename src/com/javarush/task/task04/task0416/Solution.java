package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // String sT = reader.readLine();
        double t = Double.parseDouble(reader.readLine());

        //System.out.println(t/5);
        //int temp = t/5;
//        t = t - 5 * (t/5);
        double temp = t%5;
        if (temp >= 0 && temp < 3) {
            System.out.println("зелёный");
        } else if (temp >= 3 && temp < 4) {
            System.out.println("жёлтый");
        } else if (temp >= 4 && temp < 5) {
            System.out.println("красный");
        }
       // System.out.println(t);

    }
}