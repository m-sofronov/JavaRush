package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        
        int sum = 0;
        //String variable = "";

        while (1 > 0) {
          String  variable = reader.readLine();
            if (variable.equals("сумма") ) {
                System.out.println(sum);
                break;
            } else sum += Integer.parseInt(variable);
        }

        //System.out.println(sum);



    }
}
