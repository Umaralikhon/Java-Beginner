package SibSAU;

/**
 * @author Umaralikhon Kayumov
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException, InterruptedException {
        // write your code here
        Hash hash = new Hash();

        System.out.println("Получаю данные из файла...");
        hash.setContent(); //Reading the file
        Thread.sleep(1000);

        System.out.println("Создаю ключи для данных...");
        hash.setKey(); //Setting random keys for elements
        Thread.sleep(1000);

        System.out.println("Создаю хеш таблицу на основе полученных данных...");
        hash.setTreeMap(); //Creating hash - table
        Thread.sleep(1000);

        System.out.println("\nНа основе данных файла было получено " + hash.getSize() + " элементов");
        System.out.println("Готово!");
        Thread.sleep(1500);
        System.out.println();

        int choice = menu();
        while (choice != 0) {
            if (choice == 1) { //Printing elements
                hash.printMap();

            } else if (choice == 2) { //Searching element
                System.out.println("Введите ключ элемента");
                String _key = read.readLine();
                int key = Integer.parseInt(_key); //Entering the key of element

                hash.searchElem(key);

            } else if (choice == 3) { //Removing element
                System.out.println("Введите ключ элемента");
                String _key = read.readLine();
                int key = Integer.parseInt(_key); //Entering the key of element

                hash.removeElem(key);
            }
            System.out.println();

            choice = menu();
        }
    }

    public static int menu() throws IOException {
        System.out.println("<<========================>>");
        System.out.println("<1> - Вывод данных");
        System.out.println("<2> - Поиск элемента");
        System.out.println("<3> - Удаление элемента");
        System.out.println("<0> - Выход из программы");
        System.out.print("-> ");

        String _choice = read.readLine();
        int choice = Integer.parseInt(_choice);
        System.out.println("<<========================>>");
        System.out.println();

        return choice;
    }
}
