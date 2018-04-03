package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        short i = 1, j = 1;

//        for (short j = 1; j <= 10; j++) {
//            while (i <= 10) {
//                System.out.print(j * i + " ");
//                i++;
//            }
//            System.out.println("\n");
//            i = 1;
//        }

        while (j <= 10) {
            while (i <= 10) {
                System.out.print(j * i + " ");
                i++;
            }
            i = 1;
            System.out.println("");
            j++;
        }





    }
}
