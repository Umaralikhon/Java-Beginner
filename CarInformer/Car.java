package SIBSAU;

import java.sql.*;

public class Car {
    private String modelOfCar;
    private String nameOfOwner;
    private int yearOfCar;

    private Statement stat;
    private ResultSet rs;

    public Car() {
        modelOfCar = null;
        nameOfOwner = null;
        yearOfCar = 0;
    }

    public Car(String modelOfCar, int yearOfCar, String nameOfOwner) {
        this.modelOfCar = modelOfCar;
        this.yearOfCar = yearOfCar;
        this.nameOfOwner = nameOfOwner;
    }

    public void connectWithDataBaseAndUpdate() {
        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:postgresql:Car", "postgres", "2623")) {
                String createCommand = "create table if not exists carinfo(model varchar(20), year_ int, owner_ varchar(20));";
                String insertCommand = "INSERT INTO carInfo(model, year_, owner_) VALUES (?, ?, ?);";

                PreparedStatement preparedStatement = conn.prepareStatement(insertCommand);
                preparedStatement.setString(1, modelOfCar);
                preparedStatement.setInt(2, yearOfCar);
                preparedStatement.setString(3, nameOfOwner);
                preparedStatement.executeUpdate();

                System.out.println("------------------");
                System.out.println("Success DB update!");
                System.out.println("------------------\n");

            }
        } catch (Exception ex) {
            System.out.println("Driver connection failed...");
        }
    }
}
