package com.company;

class Main
{
    public static void main(String args[])
    {
        /*
            --Дан двухмерный массив 4×4.
            --Найти сумму модулей отрицательных нечетных элементов.
         */

        int arr[][]={
                { -1, 2, 3, 4 },
                { -3, 4, 5, 6 },
                { -5, 6, 7, 8 },
                { -7, 8, 9, 0 }
        };

        int i;
        int j;
        int temp = 0;

        //Вывод всех элементов массива
        System.out.println("Все элементы массива: ");
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("__________________________________ ");

        //Вывод нечетных элементов массива
        System.out.println("Нечетные элементы массива: ");
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                if(j % 2 == 0){
                       System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("__________________________________ ");

        //Вывод отрицательных элементов массива
        System.out.println("Нечетные отрицательные элементы массива: ");
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                if(j % 2 == 0){
                    if(arr[i][j] < 0){
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }

        System.out.println();
        System.out.println("__________________________________ ");

        //Вычисление суммы отрицательных элементов
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                if(j % 2 == 0){
                    if(arr[i][j] < 0){
                      temp += arr[i][j];
                    }
                }
            }
        }
        
        System.out.println("Сумма модулей нечетных отрицательных элементов: ");
        System.out.println(Math.abs(temp) + " ");
    }
}
