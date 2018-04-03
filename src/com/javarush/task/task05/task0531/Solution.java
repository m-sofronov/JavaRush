package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int f = Integer.parseInt(reader.readLine());
        int u = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        int U = Integer.parseInt(reader.readLine());


        int minimum = min(f, u, c, k, U);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int f, int u, int c, int k, int U) {
        //return f < u ? f : u;
        int[] arr = new int[5];

        arr[0] = f;
        arr[1] = u;
        arr[2] = c;
        arr[3] = k;
        arr[4] = U;

        Arrays.sort(arr);
        //System.out.println(arr[0]);
        return arr[0];
    }
}
