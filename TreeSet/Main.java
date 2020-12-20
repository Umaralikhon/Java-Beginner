package SibSAU;

/**
 * @author Umaralikhon Kayumov

 * Из входной последовательности чисел построить бинарное дерево поиска.
 * Для каждого уровня вывести на экран значения находящихся на этом уровне узлов слева направо.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
	// write your code here
        int num;
        Tree tree = new Tree();
        int size;

        System.out.print("Введите количество элементов: ");
        String _size = read.readLine();
        size = Integer.parseInt(_size);

        //Entering the nodes of the tree
        for(int i = 0; i < size; i++){
            System.out.print("Введите элемент: ");
            String _num = read.readLine();
            num = Integer.parseInt(_num);

            tree.setNum(num);
            tree.addTree();
        }
        System.out.println();

        int choice = menu(); //Choosing next step

        while(choice != 0) {
            if (choice == 1) { //Adding new node to the tree
                System.out.print("Введите элемент: ");
                String _num = read.readLine();
                num = Integer.parseInt(_num);

                tree.setNum(num);
                tree.addTree();

            } else if (choice == 2) { //Removing the node from the tree
                System.out.print("Введите элемент: ");
                String _num = read.readLine();
                num = Integer.parseInt(_num);

                tree.setNum(num);
                tree.removeTree();

            } else if(choice == 3){ //Searching node
                System.out.print("Введите элемент: ");
                String _num = read.readLine();
                num = Integer.parseInt(_num);

                tree.setNum(num);
                tree.searchNode();

            } else if(choice == 4){ //Creating new tree & adding it the main tree
                System.out.print("Введите количество элементов: ");
                String _treeSize = read.readLine();
                int treeSize = Integer.parseInt(_treeSize);

                //Adding nodes to second tree
                for(int i = 0; i < treeSize; i++){
                    System.out.print("Введите элемент: ");
                    String _num = read.readLine();
                    num = Integer.parseInt(_num);

                    tree.setNum(num);
                    tree.createNewTree();
                    tree.joinTree();
                }
            } else if(choice == 5){ //Getting nodes which < num
                System.out.print("Введите элемент: ");
                String _num = read.readLine();
                num = Integer.parseInt(_num);

                tree.setNum(num);
                tree.smallerThanX();

            } else if(choice == 6) { //Getting nodes which > num
                System.out.print("Введите элемент: ");
                String _num = read.readLine();
                num = Integer.parseInt(_num);

                tree.setNum(num);
                tree.biggerThanX();

            } else if (choice == 7) { //Printing the tree
                tree.printTree();
            }

            System.out.println();
            choice = menu();
        }
    }

    public static int menu() throws IOException{
        System.out.println("<1> - Добавить узел");
        System.out.println("<2> - Удалить узел");
        System.out.println("<3> - Поиск узла");
        System.out.println("<4> - Присвоить другое дерево");
        System.out.println("<5> - Вывод узлов < X");
        System.out.println("<6> - Вывод узлов > X");
        System.out.println("<7> - Вывод содержимое дерева");
        System.out.println("<0> - Выход из программы");
        System.out.print("-> ");

        String _choice = read.readLine();
        int choice = Integer.parseInt(_choice);

        return choice;
    }
}
