package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> onThree = new ArrayList<Integer>();
        ArrayList<Integer> onTwo = new ArrayList<Integer>();
        ArrayList<Integer> onElse = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            numbers.add(i, Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 == 0 && numbers.get(i) % 2 == 0) {
                onThree.add(numbers.get(i));
                onTwo.add(numbers.get(i));
            } else if (numbers.get(i) % 3 == 0) {
                onThree.add(numbers.get(i));
            } else if (numbers.get(i) % 2 == 0) {
                onTwo.add(numbers.get(i));
            } else onElse.add(numbers.get(i));
        }



//        System.out.println("вссе");
//        printList(numbers);

        //System.out.println("на три");
        printList(onThree);
        //System.out.println("на два");
        printList(onTwo);
        //System.out.println("остальные");
        printList(onElse);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        for (Integer I : list) System.out.println(I);
    }
}
