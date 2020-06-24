package com.company;

class Array
{
    public static void main(String str[])
    {
        /*
            Даны числа c1, c2, …, cn. Найти произведение среднего apифметического
            положительных чисел и среднего арифметического отрицательных чисел
         */

        int arr[] = {
                1,2,3,4,5,-1,-2,-3,-4,-5,-6,-7
        };
        int temp = 0; //Для общей инициализации массива
        int positive = 0; //Для инициализации положительных чисел
        int negative = 0; //Для инициализации отрицательных чисел
        int countNegat = 0; //Счетчик для отрицательных чисел
        int countPosit = 0; //Счетчик дл положительных чисел
        int multiple; //Произведение сред. арифмет
        int i;

        //Инициализация массива
        for(i = 0; i<12; i++ ){
            temp = arr[i];

            if(temp < 0) { //Вычисление отрицательных чисел
                negative += arr[i];
                countNegat++; //Счетчик
            }

             if (temp > 0) { //Вычисление суммы положительных чисел
                 positive += arr[i];
                 countPosit++; //Счетчик
             }
        }

        multiple = (positive / countPosit) * (negative / countNegat); //Произвдение сред ариф. положительных и отрицательных чисел

        System.out.println("Количество положительных чисел: " + countPosit);
        System.out.println("Количество отрицательных чисел: " + countNegat);
        System.out.println("Сред. арифметическое положительных чисел: " + positive / countPosit);
        System.out.println("Сред. арифметическое отрицательных чисел: " + negative / countNegat);
        System.out.println("Произведение: " + multiple);
    }
}
