package com.company;

public class Array2
{
    public static void main(String array[])
    {
        /*
            Даны действительные числа c1, c2, …, cn.
            Найти произведение суммы чисел с четными индексами и суммы чисел с нечетными индексами
        */

        int arr[] = {
                1,4,3,8,5,7,7,8,9,10
        };

        int temp = 0; //Для общей инициализации
        int even = 0; //Для четных индексов
        int uneven = 0; //Для нечетных индексов
        int mult;
        int i;

        for (i=0; i<10; i++){
            temp = arr[i];
            if(i%2==0){ //Суммируются числа под четным индексом
                even+=temp;
            }

            else{ //Суммируются числа под нечетным индексом
                uneven += temp;
            }
        }

        mult = uneven * even; //Произведение сумм

        System.out.println("Сумма чисел под четными индексами: " + even);
        System.out.println("Сумма чисел под нечетными индексами: " + uneven);
        System.out.println("Произведение сумм: " + mult);
    }
}
