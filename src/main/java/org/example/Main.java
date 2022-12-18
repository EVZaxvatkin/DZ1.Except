package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    //Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
    //Метод должен пройтись по каждому элементу и проверить что он не равен null.
    //А теперь реализуйте следующую логику:
    //Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    //Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

    public static void main(String[] args) {

        Main main = new Main();
        Integer[] array = {1, null, 3, 4, null};
        main.checkArray(array);


    }

    public void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("В ячейке " + i + ", элемент = null");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new IllegalStateException("Массив содержит элементы = null");
            }
        }
    }
}




