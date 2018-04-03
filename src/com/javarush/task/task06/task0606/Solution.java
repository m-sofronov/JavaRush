package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш ко
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //int number = Integer.parseInt(reader.readLine());

//        if (number%2 == 0) {
//            even++;
//        } else odd++;

        String number = reader.readLine();
        int position = number.length() - 1;
        even = 0;
        odd = 0;

        while (position >= 0) {
            int n = number.charAt(position);
            if (n % 2 == 0) even++;
                    else odd++;
            position--;
        }
        System.out.println("Even: " + even + " Odd: " + odd);


    }
}
