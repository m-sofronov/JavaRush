package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, color, address;
    int weight, age;
//
//    public Cat(String name) {
//        this.name = name;
//        this.weight = 5;
//        this.color = null;
//        this.age = 5;
//        //this.address = null;
//    }
//
//    public Cat(String name, int weight, int age) {
//        this.name = name;
//        this.weight = weight;
//        this.age = age;
//        this.address = null;
//        this.color = null;
//    }
//
//    public Cat(String name, int weight) {
//        this.name = name;
//        this.weight = weight;
//        this.age = 5;
//        this.color = null;
//        this.address = null;
//    }
//
////    public Cat(String color, int weight) {
////        this.name = null;
////        this.address = null;
////        this.color = color;
////        this.weight = weight;
////        this.age = 5;
////    }
//    public Cat (int weight, String color) {
//        this.weight = weight;
//        this.color = color;
//        this.name = null;
//        this.address = null;
//        this.age = 10;
//    }
//
//    public Cat(int weight, String color, String address) {
//        this.name = name;
//        this.weight = weight;
//        this.age = age;
//        this.color  = color;
//        this.address = address;
//    }
    public Cat(String name) {
        this.name = name;
        this.age = 5;
        this.weight = 5;
        this.address = null;
        this.color = "black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.color = "black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.address = null;
        this.color = "black";
    }

    public Cat(int weight, String color) {
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
