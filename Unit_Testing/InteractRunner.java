package Platform;

/**
 * @author Umaralikhon Kayumov
 * @version 1.0
 * @dedicatedTo T.Nebaraev, B.Nebaraeva
 */

import java.util.Scanner;

public class InteractRunner {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String ... args) {
        int firstNum;
        int secondNum;
        double savedResult = 0.0;

        Calculator calculate;

        System.out.print("Enter first argument: ");
        firstNum = scan.nextInt();
        System.out.print("Enter second argument: ");
        secondNum = scan.nextInt();

        calculate = new Calculator(firstNum, secondNum);
        int choice = menu();

        while (choice != 0) {
            switch (choice) {
                case 1 -> {
                    savedResult = calculate.sum();
                    System.out.println("Ответ: " + savedResult);
                }
                case 2 -> {
                    savedResult = calculate.subtraction();
                    System.out.println("Ответ: " + savedResult);
                }
                case 3 -> {
                    savedResult = calculate.multiplication();
                    System.out.println("Ответ: " + savedResult);
                }
                case 4 -> {
                    savedResult = calculate.division();
                    System.out.println("Ответ: " + calculate.division());
                }
                case 5 -> {
                    System.out.println("Последний результат: " + savedResult);
                    System.out.print("Введите второй аргумент: ");
                    int secondArg = scan.nextInt();

                    System.out.println("<1> - Сложить");
                    System.out.println("<2> - Вычесть");
                    System.out.println("<3> - Умножить");
                    System.out.println("<4> - Делить");

                    choice = scan.nextInt();
                    switch (choice) {
                        case 1 -> {
                            savedResult = savedResult + secondArg;
                            System.out.println("Ответ: " + savedResult);
                        }
                        case 2 -> {
                            savedResult = savedResult - secondArg;
                            System.out.println("Ответ: " + savedResult);
                        }
                        case 3 -> {
                            savedResult = savedResult * secondArg;
                            System.out.println("Ответ: " + savedResult);
                        }
                        case 4 -> {
                            try {
                                savedResult = savedResult / secondArg;
                                System.out.println("Ответ: " + savedResult);
                            } catch (IllegalArgumentException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }
                case 6 -> {
                    savedResult = 0;
                    System.out.println("Данные обнулены!");
                }
                default -> {
                    System.out.println("Выбрана некорректная команда. Введите заново!");
                }
            }

            choice = menu();
        }
    }

    public static int menu() {
        System.out.println("<1> - Сложить");
        System.out.println("<2> - Вычесть");
        System.out.println("<3> - Умножить");
        System.out.println("<4> - Делить");
        System.out.println("<5> - Произвести вычисление с полученным результатом");
        System.out.println("<6> - Очистить");
        System.out.println("<0> - Выход");

        return scan.nextInt();
    }
}
