package Platform;

public interface Mobile {
    public void setStorage(int gb); //Устанавливает память
    public void setCamera(int mpx); //Устанавливает камеру
    public void setCost(int cost); //Устанавливает цену
    public void setModel(String model); //Устанавливает модель

    public int getStorage(); //Возвращает память
    public int getCamera(); //Возвращает камеру
    public int getCost(); //Возвращает цену
    public String getModel(); //Возвращает  модель
    public void print(); //Вывод данных
}

 class Samsung implements Mobile{
    private int gb;
    private int mpx;
    private int cost;
    private String model;

     //Устанавливает модель
    public void setModel(String model){
        this.model = model;
    }

     //Устанавливает память
    public void setStorage(int gb){
        this.gb = gb;
    }

     //Устанавливает камеру
    public void setCamera(int mpx){
        this.mpx = mpx;
    }

     //Устанавливает цену
    public void setCost(int cost){
        this.cost = cost;
    }

     //Возвращает  модель
    public String getModel(){
        return model;
    }

     //Возвращает память
    public int getStorage(){
        return gb;
    }

     //Возвращает камеру
    public int getCamera(){
        return mpx;
    }

     //Возвращает цену
    public int getCost(){
        return cost;
    }

    //Вывод данных
     public void print(){
         System.out.println("Модель: \t" + getModel());
         System.out.println("Камера: \t" + getCamera() + " mpx");
         System.out.println("Память: \t" + getStorage() + " GB");
         System.out.println("Цена: \t\t" + getCost() + " $");
         System.out.println();
     }
 }

 class Iphone implements Mobile{
     private int gb;
     private int mpx;
     private int cost;
     private String model;

     //Устанавливает модель
     public void setModel(String model){
         this.model = model;
     }

     //Устанавливает память
     public void setStorage(int gb){
         this.gb = gb;
     }

     //Устанавливает камеру
     public void setCamera(int mpx){
         this.mpx = mpx;
     }

     //Устанавливает цену
     public void setCost(int cost){
         this.cost = cost;
     }

     //Возвращает  модель
     public String getModel(){
         return model;
     }

     //Возвращает память
     public int getStorage(){
         return gb;
     }

     //Возвращает камеру
     public int getCamera(){
         return mpx;
     }

     //Возвращает цену
     public int getCost(){
         return cost;
     }

     //Вывод данных
     public void print(){
         System.out.println("Модель: \t" + getModel());
         System.out.println("Камера: \t" + getCamera() + " mpx");
         System.out.println("Память: \t" + getStorage() + " GB");
         System.out.println("Цена: \t\t" + getCost() + " $");
         System.out.println();
     }
 }
