package Platform;

/**
 * Нам нужен объект, который будет хранить информацию о Пользователе.
 * Id — нужно считать по порядку добавления нового пользователя.
 * Имя пользователя.
 * Его возраст.
 * Пол (male/female)
 * <p>
 * Нужно предусмотреть хранение списка пользователей.
 * <p>
 * Класс должен уметь.
 * Формировать список всех пользователей.
 * Формировать список пользователей по полу (MALE/FEMALE).
 * Возвращать количество пользователей в общем списке, и посчитать количество по признаку пола пользователя.
 * Посчитать общую сумму по возрасту пользователей, так же учесть по признаку пола.
 * Посчитать средний возраст, как общий так и по признаку пола.
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // write your code here
        String name;
        String userSex;
        int age;
        int id = 0;
        int size;

        Sex sex = new Sex();
        User[] user;

        System.out.print("Enter amount of users: ");
        String _size = read.readLine();
        size = Integer.parseInt(_size);
        user = new User[size];

        int choice = menu();

        while (choice != 0) {
            if (choice == 1) {
                for(int i = 0; i<size; i++) {
                    id++;
                    System.out.print("Enter name: ");
                    name = read.readLine();

                    System.out.print("Enter age: ");
                    String _age = read.readLine();
                    age = Integer.parseInt(_age);

                    System.out.println("Choose sex: " + "\n<M> - male" + "\n<F> - Female");
                    userSex = read.readLine().toUpperCase();
                    sex.setSex(userSex);

                    user[i].setInfo(id, name, age, sex);
                }
            } else if (choice == 2) {
                for (int i = 0; i < size; i++) {
                    user[i].displayAllInfo();
                }
            }
        }
    }

    private static int menu() throws IOException {
        System.out.println("<1> - Add user info: ");
        System.out.println("<2> - Display user info");
        System.out.println("<3> - Format user info");
        System.out.print("-> ");
        String choice = read.readLine();

        return Integer.parseInt(choice);
    }
}
