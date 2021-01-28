package Platform;

/*
 * Id — нужно считать по порядку добавления нового пользователя.
 * Имя пользователя.
 * Его возраст.
 * Пол (male/female)
 */

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class User {
    private String name;
    private int id;
    private int age;
    private Sex sex;
    Map<Integer, String> userMapList;
    List<Integer> ageList;

   public void setInfo(int id, String name, int age, Sex sex){
       this.id = id;
       this.name = name;
       this.age = age;
       this.sex = sex;
   }

   public int getId(){
       return id;
   }

    public String getName(){
        return name;
    }

    public int getAge(){
       return age;
    }

    public Sex getSex(){
       return sex;
    }

    public void saveUserList(){
       userMapList = new HashMap<>();
       userMapList.put(id, name);
    }

    public void createAgeList(){
       ageList = new ArrayList<>();
       ageList.add(age);
    }

    public void displayAllInfo(){
           System.out.println(userMapList.get(id) + " " + age + " " + sex);

    }
}
