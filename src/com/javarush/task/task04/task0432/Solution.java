package com.javarush.task.task04.task0432;

import java.util.Scanner;

/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        short N = input.nextShort();
        short i = 0;

        while (i < N) {
            System.out.print(s + "\n");
            i++;
        }

    }
}
