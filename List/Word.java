package SibSAU;

import java.util.ArrayList;

public class Word {
    private String word;
    private char fstLetter;
    private String fstWord;
    private String indexWord;
    ArrayList list = new ArrayList();

    /**
     * Sets word which gets from Main class
     * @param word object for adding to the list
     */
    public void setLetter(String word){
        this.word = word;
    }

    /**
     * @return Returns word to the Main class
     */
    public String getLetter(){
        return word;
    }

    /**
     * Adds elements to list
     * @param cont counter for continuing the cycle
     */
    public void setList(int cont){
            list.add(word);
    }

    /**
     * @return size of the list
     */
    public int getSize(){
        return list.size();
    }

    /**
     * Adds element to the begin of the list
     * @param fstWord word, which should be added to the begin
     */
    public void setFstWord(String fstWord){
        list.add(0, fstWord);

        if(list.get(0) == fstWord){
            System.out.println("Успешно добавлен!");

        }else{
            System.out.println("Ошибка при добавлении!");
        }
    }

    /**
     * Adds element by index
     * @param index the index of list where element should be added
     * @param indexWord the word, which should be added
     */
    public void setIndexWord(int index, String indexWord){
        list.add(index, indexWord);

        if(list.get(index) == indexWord){
            System.out.println("Успешно добавлен!");

        }else{
            System.out.println("Ошибка при добавлении!");
        }
    }

    //Deleting element from begin of the list
    public void delFstWord(){
        String fst = (String)list.get(0);

        list.remove(0);

        if(list.get(0) != fst){
            System.out.println("Успешно удален!");
        }else{
            System.out.println("Ошибка при удалении!");
        }
    }

    //Deleting element from the end of the list
    public void delLastWord(){
        String last = (String)list.get(list.size() - 1);

        list.remove(list.size() - 1);

        if(list.get(list.size()- 1) != last){
            System.out.println("Успешно удален!");
        }else{
            System.out.println("Ошибка при удалении!");
        }
    }

    //Deleting element by index
    public void delIndexWord(int index){
        String ind = (String)list.get(index);

        list.remove(index);

        if(list.get(index) != ind){
            System.out.println("Успешно удален!");
        }else{
            System.out.println("Ошибка при удалении!");
        }
    }

    //Search by index
    public void searchByIndex(int index){
        System.out.println("Результат: " + list.get(index));
    }

    //Search by value
    public void searchElem(String obj){
        int index = list.indexOf(obj);

        System.out.println("Результат: " + list.get(index));
    }

    /**
     * Prints the first letter of the word
     * @return Returns firstLetter of the word
     */
    public void getFstLetter(){
        String[] strArr = new String[list.size()];
        char[] charArr = new char[list.size()];

        list.toArray(strArr); //Rebuilding list to the String array

        for(int i = 0; i < list.size();i++){
            charArr = strArr[i].toCharArray(); //Rebuilding String array to char array
            System.out.print(charArr[0] + "  "); //Getting first letter of the word

        }
    }

    //Prints the list
    public void printList(){
        System.out.println("____________________________________");
        for(Object obj : list){
            System.out.println(obj);
        }
        System.out.println("____________________________________");

    }
}
