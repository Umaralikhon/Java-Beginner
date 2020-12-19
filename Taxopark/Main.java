package Platform;
/**
 * @author Umaralikhon Kayumov
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String ... args)throws IOException{
        Taxopark taxi = new Taxopark();
        String[] name;
        String[] model;
        String[] number;
        int fromDay, fromMonth;
        int toDay, toMonth;
        int period = 0; //For counting days
        int size; //Amount of drivers
        double waste = 0;
        double totalWaste = 0;

        System.out.print("Enter the amount of cars: ");
        String _size = read.readLine();
        size = Integer.parseInt(_size);
        taxi.setSize(size);

        //Entering begin of counting days & month
        System.out.print("Enter start day: ");
        String _fromDay = read.readLine(); //Entering day
        fromDay = Integer.parseInt(_fromDay);
        System.out.print("Enter start month: ");
        String _fromMonth = read.readLine(); //Entering month
        fromMonth = Integer.parseInt(_fromMonth);

        //Entering end of counting days & month
        System.out.print("Enter end day: ");
        String _toDay = read.readLine(); //Entering day
        toDay = Integer.parseInt(_toDay);
        System.out.print("Enter end month: ");
        String _toMonth = read.readLine(); //Entering month
        toMonth = Integer.parseInt(_toMonth);

        if(fromMonth == toMonth) period = toDay - fromDay; //Counting full period in case the days in the same month
        else if (fromMonth < toMonth){ //Counting full period in case the days in different months
            int to = 0;
            int from = 0;

            for(int i = fromDay; i < 30; i++) from++; //Incrementing & counting days till the end of previous month
            for(int i = toDay; i > 0; i-- ) to++; //Decrementing & counting days till the begin of month

            period = from + to; //Counting full period

        } else System.out.println("Incorrect date!"); //If the date was entered incorrect

        System.out.println();
        taxi.setPeriod(period); //Calling the method which receives period
        taxi.setDate(fromDay, fromMonth, toDay, toMonth);

        System.out.println("Counting for " + taxi.getPeriod() + " days");
        System.out.println("From " + taxi.getFromDate() + " till " + taxi.getToDate());
        System.out.println("____________________________________________");

        //Setting the size of arrays
        name = new String[size];
        model = new String[size];
        number = new String[size];

        double[] sumWaste = new double[period]; //Setting the the size of array for counting periods

        //Entering information about drivers & cars
        for(int i = 0; i < size; i++){
            System.out.print("Name: ");
            name[i] = read.readLine();

            System.out.print("Number: ");
            number[i] = read.readLine();

            System.out.print("Model: ");
            model[i] = read.readLine();

            System.out.println("Enter fuel waste for every day");

            double summ = 0;
            //Entering the waste of fuel per every day
            for(int j = 0; j < period; j++){

                System.out.print("\t" + (j + 1) + " - day: ");
                String _waste = read.readLine();
                waste = Double.parseDouble(_waste);
                summ+=waste; //Counting the sum of fuel waste
            }
            System.out.println();

            sumWaste[i] = summ; //Sum waste of fuel for every car
            totalWaste += sumWaste[i]; //Counting total waste of fuel
        }

        //Calling methods
        taxi.setSumWaste(sumWaste); //Sum fuel waste of every car
        taxi.setTotalWaste(totalWaste); //Total fuel waste
        taxi.setName(name); //Sets name of drivers
        taxi.setNumber(number); //Sets car number
        taxi.setModel(model); //Sets model of cars
        taxi.printInfo(); //Printing conclusion
    }
}
