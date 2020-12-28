package Platform;

/**
 * @author Umaralikhon Kayumov
 * @version 2.1
 * <p>
 * This console program is gets and save pharmacy pills
 */

import java.util.*;
import java.lang.Integer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;

public class Main {

    public static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, NumberFormatException {
        // write your code here
        int cost;
        String name;
        String search;
        int size;
        int type;
        int sum = 0; //Counts total cost of basket
        String path = "absentPills.txt";


        //menu();
        type = menu();

        Map<String, Pills> pills = new HashMap<>(); //HashMap for creating total list for all elements
        Map<String, Basket> basket = new HashMap<>(); //HashMap for adding elements to the basket

        int i = 1;
        while (type != 0) {
            //Adds new pills to the list
            if (type == 1) {
                System.out.println("\n" + (i));
                System.out.print("Enter the name of pill: ");
                name = read.readLine().toUpperCase();

                System.out.print("Enter the cost of pill: ");
                String c = read.readLine();
                cost = Integer.parseInt(c);

                pills.put(name, new Pills(cost));
                System.out.println();

                i++;
            }

            //Prints pills list with its cost
            else if (type == 2) {
                for (Map.Entry<String, Pills> p : pills.entrySet()) {
                    System.out.println("-> " + p.getKey() + "\t" + p.getValue().getCost());
                }
                System.out.println();
            }

            //Search pills in list
            else if (type == 3) {
                System.out.println("Enter the searching element");
                System.out.print("-> ");
                search = read.readLine().toUpperCase();

                //If searching element exists in list
                if (pills.get(search) != null) {
                    System.out.println(search + " " + pills.get(search).getCost());
                    System.out.println("<1> - Add to the basket");
                    System.out.println("<2> - Menu");

                    String _searchMenu = read.readLine();
                    int searchMenu = Integer.parseInt(_searchMenu);

                    //Searched element adds tj the basket and count the sum os all pills in the basket
                    if (searchMenu == 1) {
                        int costOfSearch = pills.get(search).getCost();
                        basket.put(search, new Basket(costOfSearch));

                        System.out.println("Total cost: " + (sum += costOfSearch));
                    }

                } else { //If nothing founded
                    System.out.println("|----------------- |");
                    System.out.println("| Nothing founded! |");
                    System.out.println("|----------------- |");

                    FileWriter fWrite = new FileWriter(path, true);

                    fWrite.write(search); //Adding absent element to the file
                    fWrite.append("\n");
                    fWrite.flush();

                    System.out.println("Pill is added to the absent list!");
                }
            }

            //Shows the basket and total cost
            else if (type == 4) {
                System.out.println("Your basket");

                for (Map.Entry<String, Basket> b : basket.entrySet()) {
                    System.out.println("-> " + b.getKey() + "\t" + b.getValue().getCost());
                }
                System.out.println("Total cost: " + sum);
            }

            //Quit the program
            else if (type == 0) return;

            System.out.println();
            type = menu();
        }
    }

    /**Function for main menu
     *
     * @return type - chosen operation
     * @throws IOException
     */
    public static int menu() throws IOException {
        int type;

        System.out.println("<1> - Add new goods");
        System.out.println("<2> - Print goods");
        System.out.println("<3> - Search pills");
        System.out.println("<4> - Show basket");
        System.out.println("<0> - Quit");
        System.out.print("-> ");
        String s = read.readLine();
        type = Integer.parseInt(s);

        return type;
    }
}
