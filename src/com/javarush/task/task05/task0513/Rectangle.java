package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int height) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = height;
    }

    public void initialize() {
        this.top = 4;
        this.left = 5;
        this.width = 5;
        this.height = 4;
    }

    public static void main(String[] args) {

    }
}
