package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int top, int left, int height) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = height;
    }

    public Rectangle() {
        this.top = 4;
        this.left = 5;
        this.width = 5;
        this.height = 4;
    }

    public static void main(String[] args) {

    }
}
