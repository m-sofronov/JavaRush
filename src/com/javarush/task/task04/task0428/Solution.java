package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 <= 0 && num2 <= 0 && num3 <= 0) System.out.println(0);
        else if (num1 > 0 && num2 > 0 && num3 > 0) System.out.println(3);
        else if (num1 > 0 && num2 > 0 || num3 > 0 && num2 > 0 || num1 > 0 && num3 > 0) System.out.println(2);
        else if (num1 > 0 || num2 > 0 || num3 > 0) System.out.println(1);

    }
}
