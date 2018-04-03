package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int     i = 0;
        double  temp = 0.0,
                count = 0.0;

        while (i != -1) {
            i = Integer.parseInt(reader.readLine());
            if (i != -1) {
                temp += i;
               // System.out.println(temp);
                count++;
                //System.out.println(count);
            }
        }
        System.out.println(temp/count);
    }
}

