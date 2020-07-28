package com.company;
import java.util.*;

/*
    Строки:
    Напишите метод, который проверяет является ли слово палиндромом.
    Палиндром - слово или текст, одинаково читаещееся в обоих направлениях
 */

//Класс для проверки строки на полиндромность
class Polindrom{
    private String str;
    char[] strToArr; //Для преобразования строку в массив

    //Принимает строку из главного класса
    void getStr(String str){
        this.str = str;
    }


    void checker(){
        strToArr = str.toCharArray(); //Преобразование строки в массив
        for(int i = 0; i < strToArr.length; i++){
            System.out.print(strToArr[i] + " ");
        }
        System.out.println();

        int border = (strToArr.length); //Размер массива
        int size = border; //Необходим для замены местами элементов 2-х массивов (Внизу)
        char newStr[] = new char[border]; //Объявление нового массивы для перемещения элементов

        for(int i = 0; i < border; i++){
            size--;

            newStr[i] = strToArr[size];
            System.out.print(newStr[i] + " " );
        }
        System.out.println();

        int count1 = 0;

        for(int i  = 0; i < border; i++){
            if(strToArr[i] == newStr[i]){
                count1 += 0;
            }
            else{
                count1++;
            }
        }

        /*
            Внизу ФИЧИ! Если проверенные в цикле слова не равны, то счетчик count1 увеличивается.
            В противном случае счетчик остается неизменным, что озночает полиндромность.
            Это и определяется в следующем условии:
         */
        if(count1 > 0){
            System.out.println("Не полиндром!!");
        }
        else{
            System.out.println("Полиндром!");
        }
    }
}

//Выполняющий класс
class Main{
    public static Scanner arg = new Scanner(System.in);
    public static void main(String ...args){
        Polindrom word = new Polindrom();
        String str;

        System.out.print("Введите слово: ");
        str = arg.nextLine();

        //Вызов методов класса
        word.getStr(str);
        word.checker();
    }
}
