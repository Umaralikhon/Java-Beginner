package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
/*
    Абстрактные классы и интерфейсы

        Задача:
        Напишите класс для конвертации из градусов по Цельсию в Кельвины​, ​Фаренгейты​,
        и так далее. У метода должен быть метод convert, который и делает конвертацию.
*/

//Объявляем интерфейс
interface Converter{
    double convert(double celsius, double other);
}

//Класс для конвертации
class Convert implements Converter{
    public double convert(double celsius, double other){
        return celsius * other;
    }
}

//Исполняющий класс
class Main {
    public static Scanner num = new Scanner(System.in);

    public static void main(String... args) {
        int choice; //Выбор темрператур
        int celsius; //Ввод цельсия
        Convert deg = new Convert();

        System.out.println("Выберите единицу измерения температур для конвертации из Цельсия: ");
        System.out.println("(1) - Фаренгейт");
        System.out.println("(2) - Кельвин");
        System.out.println("(3) - Реомюр");

        //Выбор темрператур
        System.out.print(">>");
        choice = num.nextInt();
        while(choice > 3){ //Если введен неправильное значение
            System.out.println("Вы ввели неправильное значение!");
            System.out.print("Введите заново: " );
            choice = num.nextInt();
        }

        //Ввод градусы в цельсиях
        System.out.print("Введите градусы в цельсиях:");
        celsius = num.nextInt();

        //Конвертация в фаренгейт
        if (choice == 1) {
            System.out.println("Цельсий" + "\t\t" + "Фаренгейт");
            System.out.println(1 + "\t\t\t" + 33.8);
            System.out.println(celsius + "\t\t\t" + deg.convert(celsius, 33.8));
        }

        //Конвертация в кельвин
        else if (choice == 2) {
            System.out.println("Цельсий" + "\t\t" + "Кельвин");
            System.out.println(1 + "\t\t\t" +  274);
            System.out.println(celsius + "\t\t\t" + deg.convert(celsius, 274));
        }

        //Конвертация в реомюр
        else{
            System.out.println("Цельсий" + "\t\t" + "Реомюр");
            System.out.println(1 + "\t\t\t" + 0.8);
            System.out.println(celsius + "\t\t\t" + deg.convert(celsius, 0.8));
        }
    }
}
