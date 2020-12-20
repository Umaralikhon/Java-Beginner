package SibSAU;

import java.util.TreeSet;

public class Tree {
    TreeSet tree = new TreeSet<Integer>(); //Creating main tree
    TreeSet newTree = new TreeSet<Integer>(); //Creating second tree for adding to the main tree
    private int num; //Nodes of tree

    //Getter & setter for nodes of tree
    public void setNum(int num){ this.num = num; }
    public int getNum(){ return num; }

    //Adding nodes to the tree
    public void addTree() {
        tree.add(getNum());
    }

    //Removing node from the tree
    public void removeTree(){
        if(tree.remove(getNum())){
            System.out.println("Успешно удален!");
        } else System.out.println("Ошибка при удалении!");
    }

    //Searching node of tree tree
    public void searchNode(){
        if(tree.floor(num) != null) System.out.println("Результат: " + tree.floor(num));
        else System.out.println("Такого узла нет!");
    }

    //Creating new tree for adding it to the main tree
    public void createNewTree(){
        newTree.add(getNum());
    }

    //Adding second tree to the main tree
    public void joinTree(){
        tree.addAll(newTree);
    }

    //Methods for getting tail & head part of the tree
    public void smallerThanX(){
        System.out.println(tree.headSet(num));
    }
    public void biggerThanX(){ System.out.println(tree.tailSet(num)); }

    //Printing the tree
    public void printTree(){
        System.out.println("\n=========================================");
        for(Object i : tree){
            System.out.print((int)i + " ");
        }
        System.out.println("\n=========================================");
    }
}
