package SIBSAU;

import java.util.*;
import java.io.*;

public class Main {
    public static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	// write your code here
        String modelOfCar;
        String nameOfOwner;
        int yearOfCar;

        Car car = new Car();
        GetCarInfo getInfo = new GetCarInfo();

        int choice = menu();

        while(choice != 0){
            if(choice == 1){ //Adding elements
                System.out.print("Enter the name of owner: ");
                nameOfOwner = read.readLine();
                System.out.print("Enter the model of car: ");
                modelOfCar = read.readLine();
                System.out.print("Enter the year of car: ");
                yearOfCar = scan.nextInt();

                car = new Car(modelOfCar, yearOfCar, nameOfOwner);
                car.connectWithDataBaseAndUpdate();

            }else if(choice == 2){ //Searching by model
                System.out.print("\nEnter model  for searching: ");
                modelOfCar = read.readLine();

                getInfo = new GetCarInfo(modelOfCar);
                getInfo.getCarInfo();
                System.out.println("================================================");

            }else if(choice == 3){ //Searching by year
                System.out.print("\nEnter year for searching: ");
                yearOfCar = scan.nextInt();

                getInfo = new GetCarInfo(yearOfCar);
                getInfo.getCarInfo();
                System.out.println("================================================");

            }else if(choice == 4) { //Searching by model & year
                System.out.print("\nEnter model  for searching: ");
                modelOfCar = read.readLine();
                System.out.print("Enter year for searching: ");
                yearOfCar = scan.nextInt();

                getInfo = new GetCarInfo(modelOfCar, yearOfCar);
                getInfo.getCarInfo();
                System.out.println("================================================");

            }

            choice = menu();
        }
    }

    public static int menu(){
        System.out.println("<1> - Add car");
        System.out.println("<2> - Search by model");
        System.out.println("<3> - Search by year");
        System.out.println("<4> - Search by model & year");
        System.out.println("<0> - Quit");
        System.out.print("-> ");

        return scan.nextInt();
    }
}
