package Platform;

import java.util.Scanner;

class Main{
    public static Scanner arg = new Scanner (System.in);
    public static void main(String ... args){
        int gb;
        int mpx;
        int cost;
        int size;
        String model;
        int choice;

        Samsung[] samsung;
        Iphone[] iphone;

        System.out.println("Выберите модель");
        System.out.println("<1> Samsung");
        System.out.println("<2> iPhone");
        System.out.print("==> ");
        choice = arg.nextInt();

        System.out.println("Введите количество устройств: ");
        System.out.print("==> ");
        size = arg.nextInt();

        if(choice == 1){
            samsung = new Samsung[size];
            System.out.println("SAMSUNG>");

            for(int i = 0; i < samsung.length; i++){
                arg.nextLine();
                samsung[i] = new Samsung();

                System.out.print("Введите модельный ряд ->" );
                model = arg.nextLine();
                System.out.print("Введите память ->" );
                gb = arg.nextInt();
                System.out.print("Введите камеру ->" );
                mpx = arg.nextInt();
                System.out.print("Введите цену ->" );
                cost = arg.nextInt();
                System.out.println();

                samsung[i].setModel(model);
                samsung[i].setStorage(gb);
                samsung[i].setCamera(mpx);
                samsung[i].setCost(cost);
            }

            System.out.println("<-- ---------------------- -->");

            for (int i = 0; i < size; i++){
               samsung[i].print();
            }
        }else if(choice == 2) {
            iphone = new Iphone[size];
            System.out.println("iPhone");

            for (int i = 0; i < iphone.length; i++) {
                arg.nextLine();
                iphone[i] = new Iphone();

                System.out.print("Введите модельный ряд ->");
                model = arg.nextLine();
                System.out.print("Введите память ->");
                gb = arg.nextInt();
                System.out.print("Введите камеру ->");
                mpx = arg.nextInt();
                System.out.print("Введите цену ->");
                cost = arg.nextInt();
                System.out.println();

                iphone[i].setModel(model);
                iphone[i].setStorage(gb);
                iphone[i].setCamera(mpx);
                iphone[i].setCost(cost);
            }

            System.out.println("<-- ---------------------- -->");

            for (int i = 0; i < size; i++) {
                iphone[i].print();
            }
        }else{
            System.out.println("Ошибка!");
        }
    }
}
