package Platform;
//Реализовать иерархию классов, описывающую трёхмерные фигуры

import java.util.Scanner;

/**
 * @author Umaralikhon Kayumov
 */


public class Main {

    static int choice;

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exceptions {
        // write your code here

        double r;
        double h;
        double s;
        double a, b, c;

        Cone cone;
        Ball ball;
        Paral paral;
        Pyramid pyramid;

        menu();

        while (choice != 0) {
            if (choice == 1) { //Конус
                System.out.println("Введите данные фигуры");
                System.out.print("R-> ");
                r = scanner.nextDouble();
                System.out.print("H-> ");
                h = scanner.nextDouble();

                if (r <= 0 || h <= 0) throw new Exceptions();

                cone = new Cone(r, h);
                cone.countValOfCone();
                cone.printConeInfo();
            } else if (choice == 2) { //Шар
                System.out.println("Введите данные фигуры");
                System.out.print("R-> ");
                r = scanner.nextDouble();

                if (r <= 0) throw new Exceptions();

                ball = new Ball(r);
                ball.countValOfBall();
                ball.printBallInfo();
            } else if (choice == 3) { //Параллелепипед
                System.out.println("Введите данные фигуры");
                System.out.print("A-> ");
                a = scanner.nextDouble();
                System.out.print("B-> ");
                b = scanner.nextDouble();
                System.out.print("C-> ");
                c = scanner.nextDouble();

                if (a <= 0 || b <= 0 || c <= 0) throw new Exceptions();

                paral = new Paral(a, b, c);
                paral.countValOfParal();
                paral.printParalInfo();
            } else if (choice == 4) { //Пирамида
                System.out.println("Введите данные фигуры");
                System.out.print("S-> ");
                s = scanner.nextDouble();
                System.out.print("H-> ");
                h = scanner.nextDouble();

                if (s <= 0 || h <= 0) throw new Exceptions();

                pyramid = new Pyramid(s, h);
                pyramid.countValOfPyramid();
                pyramid.printPyramidInfo();
            } else {
                System.out.println("Неопознанная ошибка!");
            }

            menu();
        }

    }

    public static void menu() {
        System.out.println("Выберите тип фигуры: ");
        System.out.println("<1> Конус");
        System.out.println("<2> Шар");
        System.out.println("<3> Параллелепипед");
        System.out.println("<4> Пирамида");
        System.out.println("<0> Выход из программы");
        System.out.print("-> ");
        choice = scanner.nextInt();
    }

}
