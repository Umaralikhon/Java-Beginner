package SibSAU;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Hash {
    private String[] strArr; //Array for keeping elements which was received from file
    private String path = "D:\\СибГУ\\Алгоритмы\\Лабы\\Lab5\\Textfile.txt"; //File path
    FileReader reader;
    List<String> words; //Reads elements from file
    TreeMap<Integer, String> treeMap = new TreeMap<>();
    private int[] key; //Keeps keys for  elements
    int size = 0;

    //Reads file from computer
    void setContent() throws IOException {
        reader = new FileReader(path);
        var content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);

        words = List.of(content.split("\\PL"));
        strArr = new String[words.size()];

        for (int i = 0; i < words.size(); i++) {
            strArr[i] = words.get(i); //Includes elements to the array
        }

        size = words.size();
    }

    //Random creates keys for elements
    void setKey() {
        key = new int[size];
        for (int i = 0; i < size; i++) {
            int temp = (int) ((Math.random() * 1000) + 10000);
            temp *= temp; //Gets square of random element
            temp >>= 11; //Gets middle part of byte code of variable
            temp = temp % 1024;
            key[i] = temp; //Includes key to array
        }
    }

    //Gets amount(size) of elements
    public int getSize(){
        return size;
    }

    //Creates hash - table
    public void setTreeMap() {
        for (int i = 0; i < size; i++) {
            treeMap.put(key[i], strArr[i]); //Sets key & value to the hash - table
        }
    }

    /**
     * Searches element in the hash - table
     * @param key the key of searching element
     */
    public void searchElem(int key) {
        if (treeMap.get(key) != null) {
            System.out.println("Результат: " + treeMap.get(key));

        } else System.out.println("Ничего не найдено!");
    }

    /**
     * Removes element from the hash - table
     * @param key the key of removing element
     */
    public void removeElem(int key) {
        treeMap.remove(key);
        if (treeMap.get(key) == null) {
            System.out.println("Элемент удален!");
        }
    }

    //Printing hash - table
    public void printMap() {
        System.out.println("_________________________________________");
        for (Map.Entry<Integer, String> item : treeMap.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
        System.out.println("_________________________________________");
        System.out.println();
    }
}
