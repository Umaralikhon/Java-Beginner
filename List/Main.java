package SibSAU;

/**
 * @author Umaralikhon Kayumov
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // write your code here
        String str;
        Word word = new Word();
//        var list = new ArrayList();
        int cont = 1;
        int size;

        while (cont != 0) {
            System.out.print("\nEnter the word: ");
            str = read.readLine();

            word.setLetter(str);
            word.setList(cont);
            //list.add(str);

            System.out.println("<1> - Continue");
            System.out.println("<0> - Stop");

            System.out.print("-> ");

            String c = read.readLine();
            cont = Integer.parseInt(c);
        }

        int choice = 10;

        while (choice != 0) {
            if (choice == 1) { //Adding word to the begin of the list
                System.out.print("Введит слово: ");
                String addFst = read.readLine();
                word.setFstWord(addFst);

            } else if (choice == 2) { //Adding word by index
                System.out.print("Введите индекс: ");
                String ind = read.readLine();
                int index = Integer.parseInt(ind);

                System.out.print("Введите слово: ");
                String indexWord = read.readLine();

                word.setIndexWord(index, indexWord);

            } else if(choice == 3){ //Deleting first element
                word.delFstWord();

            }else if(choice == 4){ //Deleting last element
                word.delLastWord();

            }else if(choice == 5){ //Deleting element by index
                System.out.print("Введите индекс: ");
                String ind = read.readLine();
                int index = Integer.parseInt(ind);

                word.delIndexWord(index);

            }else if(choice == 6){ //Searching element by index
                System.out.print("Введите индекс: ");
                String ind = read.readLine();
                int index = Integer.parseInt(ind);

                word.searchByIndex(index);

            }else if(choice == 7){ //Searching element by value
                System.out.print("Введите значение: ");
                String obj = read.readLine();

                word.searchElem(obj);

            }else if(choice==8){ //Printing the first letters of the word
                System.out.println("Первые буквы всех элементов списка: ");
                word.getFstLetter();
            }else if (choice == 9) { //Printing list
                word.printList();
            }

            choice = menu();
        }

    }

    public static int menu() throws IOException {
        System.out.println("\n=======================================");
        System.out.println("<1> - Добавить элемент в начало");
        System.out.println("<2> - Добавить элемент по индексу");
        System.out.println("<3> - Удалить элемент из начала списка");
        System.out.println("<4> - Удалить элемент из конца списка");
        System.out.println("<5> - Удалить элемент по индексу");
        System.out.println("<6> - Поиск элемента по индексу");
        System.out.println("<7> - Поиск элемента по значению");
        System.out.println("<8> - Вывод первых букв элементов");
        System.out.println("<9> - Вывод списка");
        System.out.println("<0> - Выход");
        System.out.print("-> ");


        int choice;
        String ch = read.readLine();
        choice = Integer.parseInt(ch);
        System.out.println("=======================================");
        System.out.println();


        return choice;
    }
}
