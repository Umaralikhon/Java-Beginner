package Platform;

import java.util.Date;

class Taxopark {

    private String[] number;
    private String[] name;
    private String[] model;
    private int size;
    private int period;
    private double waste;
    private double totalWaste;
    private double[] sumWaste;
    private Date fromDate, toDate;

    //Setter & getters for calendar date
    public void setDate(int fromDay, int fromMonth, int toDay, int toMonth) {
        fromDate = new Date(2020, fromMonth - 1, fromDay, 0,0,0);
        toDate = new Date(2020, toMonth - 1, toDay,0,0,0);
    }

    public Date getFromDate(){ return fromDate; }
    public Date getToDate(){ return toDate; }

    //Setter & getter for counting all wasted fuel
    public void setTotalWaste(double allWaste){ this.totalWaste = allWaste; }
    public double getTotalWaste(){ return totalWaste; }

    //Setter & getter of sum fuel waste
    public void setSumWaste(double[] sumWaste) {this.sumWaste = sumWaste; }
    public double getSumWaste(){return sumWaste[period]; }

    //Setter & getter of counting period
    public void setPeriod(int period) { this.period = period; }
    public int getPeriod() { return period; }

    //Setter & getter of size for arrays
    public void setSize(int size){ this.size = size; }
    public int getSize(){return size; }

    //Setter & getter for numbers of every cars
    public void setNumber(String[] number){ this.number = number; }
    public String getNumber(){ return number[size];}

    //Setter & getter for name of the drivers
    public void setName(String[] name){ this.name = name; }
    public String getName(){ return name[size]; }

    //Setter & getter for models of cars
    public void setModel(String[] model) { this.model = model; }
    public String getModel(){ return model[size]; }

    //Prints cull information
    public void printInfo(){
        System.out.println();
        System.out.println("____________________________________________");

        for(int i = 0; i < size; i++){
            System.out.println(name[i] + " || " + number[i] + " || " + model[i]);
            System.out.println("Sum waste: " + sumWaste[i]);
            System.out.println();
        }

        System.out.println("Total fuel waste: " + getTotalWaste());
        System.out.println("____________________________________________");
    }
}
