/*
    Задание:
    Кредиты. Реализовать выбор и поиск кредита.
    Сформировать набор предложений клиенту по целевым кредитам для оптимального выбора.
 */

/*
    Выполнение программы
    Программа на вход принимает введенное пользователем вид кредита, сумму и срок. Данные передаются в класс Credit
    для подсчета  ежемесячной платы. Результат возвращается в методе countCredit класса Credit в главный класс.
**/


package com.company;
import java.util.Scanner;

class Credit{
    private double autoPercent = 9.9; //Процентная вставка автокредита
    private double mortgagePercent = 7.3; //Процентная вставка ипотеки
    private double userPercent = 8.4; //Процентная вставка пользовательского кредита

    private int sum; //Введенная сумма
    private int month; //Введенный месяц
    private int type; //Выбранный тип кредита
    private double payment; //Ежемесячный платеж

    //Вывод типов кредита
    void printTypeOfCredit(){
        System.out.println("1. Пользовательский кредит");
        System.out.println("2. Автокредит");
        System.out.println("3. Ипотека");
    }

    //Принимает данные от пользователья
    void getData(int month, int sum, int type){
        this.month = month;
        this.sum = sum;
        this.type = type;
    }

    //Подсчет ежемесячной оплаты
    double countCredit(){
        //Для пользовательского кредита
        if(type == 1){
            payment = sum * userPercent / month;
        }

        //Для автокредита
        else if(type == 2){
            payment = sum * autoPercent / month;
        }

        //Для ипотеки
        else{
            payment = sum * mortgagePercent / month;
        }
        return payment;
    }
}


//Вход
class Main {
    public static Scanner arg = new Scanner(System.in);
    public static void main(String... args) {
        Credit add = new Credit();
        int choiceType; //Выбор типа кредита
        int creditSum; //Кредитная сумма
        int month; //Срок кредита

        System.out.println("Выберите тип кредита: ");
        add.printTypeOfCredit(); // Вывод типы кредитов (метод)
        System.out.print("> ");
        choiceType = arg.nextInt();
        System.out.println();

        //Пользовательский кредит
        if (choiceType == 1) {
            System.out.println("Вы выбрали пользовательский кредит");
            System.out.println("Максимальный размер кредита 5 000 000 рублей");
            System.out.println("Максимальный срок 70 месяц");
            System.out.println();

            System.out.print("Введите сумму кредита: ");
            creditSum = arg.nextInt();

            //Если сумма превышает лимита
            while (creditSum > 5_000_000) {
                System.out.println("Максимальный размер кредита 5 000 000 рублей!");
                System.out.print("Введите сумму заново: ");
                creditSum = arg.nextInt();
            }

            System.out.print("Выберите срок в меяцах: ");
            month = arg.nextInt();

            //Если месяц превышает лимита
            while (month > 70) {
                System.out.println("Максимальный срок 70 месяц!");
                System.out.print("Введите срок заново: ");
                month = arg.nextInt();
            }

            //Результат
            add.getData(month, creditSum, choiceType);
            System.out.println("Ежемесячный платеж составляет: " + add.countCredit());
        }

        //Автокредит
        else if (choiceType == 2) {
            System.out.println("Вы выбрали автокредит");
            System.out.println("Максимальный размер кредита 2 000 000 рублей");
            System.out.println("Максимальный срок 36 месяц");
            System.out.println();

            System.out.print("Введите сумму кредита: ");
            creditSum = arg.nextInt();

            //Если сумма превышает лимита
            while (creditSum > 2_000_000) {
                System.out.println("Максимальный размер кредита 2 000 000 рублей!");
                System.out.print("Введите сумму заново: ");
                creditSum = arg.nextInt();
            }

            System.out.print("Выберите срок в меяцах: ");
            month = arg.nextInt();

            //Если месяц превышает лимита
            while (month > 36) {
                System.out.println("Максимальный срок 36 месяц!");
                System.out.print("Введите срок заново: ");
                month = arg.nextInt();
            }

            //Результат
            add.getData(month, creditSum, choiceType);
            System.out.println("Ежемесячный платеж составляет: " + add.countCredit());
        }

        //Ипотека
        else if (choiceType == 3) {
            System.out.println("Вы выбрали ипотечный кредит");
            System.out.println("Максимальный размер кредита 12 000 000 рублей");
            System.out.println("Максимальный срок 360 месяц");
            System.out.println();

            System.out.print("Введите сумму кредита: ");
            creditSum = arg.nextInt();

            //Если сумма превышает лимита
            while (creditSum > 12_000_000) {
                System.out.println("Максимальный размер кредита 12 000 000 рублей!");
                System.out.print("Введите сумму заново: ");
                creditSum = arg.nextInt();
            }

            System.out.print("Выберите срок в меяцах: ");
            month = arg.nextInt();

            //Если месяц превышает лимита
            while (month > 360) {
                System.out.println("Максимальный срок 360 месяц!");
                System.out.print("Введите срок заново: ");
                month = arg.nextInt();
            }

            //Результат
            add.getData(month, creditSum, choiceType);
            System.out.println("Ежемесячный платеж составляет: " + add.countCredit());
        }

        else System.out.println("Неопознанная ошибка! Для поддержки свяжитесь по почте bank@mail.ru");
    }
}
