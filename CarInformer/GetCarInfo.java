package SIBSAU;

import java.sql.*;

public class GetCarInfo {
    private String modelOfCar;
    private int yearOfCar;

    public GetCarInfo() {
        modelOfCar = null;
        yearOfCar = 0;
    }

    public GetCarInfo(int yearOfCar) {
        this.yearOfCar = yearOfCar;
    }

    public GetCarInfo(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public GetCarInfo(String modelOfCar, int yearOfCar) {
        this.modelOfCar = modelOfCar;
        this.yearOfCar = yearOfCar;
    }

    public void getCarInfo() {
        try {
            Class.forName("org.postgresql.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:postgresql:Car", "postgres", "2623")) {
                if (modelOfCar == null) {
                    String selectCommand = "SELECT * FROM carInfo WHERE year_ = ?;";

                    PreparedStatement preparedStatement = conn.prepareStatement(selectCommand);
                    preparedStatement.setInt(1, yearOfCar);
                    ResultSet rs = preparedStatement.executeQuery();

                    while (rs.next()) {
                        System.out.println(rs.getString("Model") + " "
                                + rs.getString("year_") + " "
                                + rs.getString("owner_"));
                    }

                } else if (yearOfCar == 0) {
                    String selectCommand = "SELECT * FROM carInfo WHERE model = ?;";

                    PreparedStatement preparedStatement = conn.prepareStatement(selectCommand);
                    preparedStatement.setString(1, modelOfCar);
                    ResultSet rs = preparedStatement.executeQuery();

                    while (rs.next()) {
                        System.out.println(rs.getString("Model") + " "
                                + rs.getString("year_") + " "
                                + rs.getString("owner_"));
                    }

                } else if (modelOfCar != null && yearOfCar != 0) {
                    String selectCommand = "SELECT * FROM carInfo WHERE model = ? and year_ = ?;";

                    PreparedStatement preparedStatement = conn.prepareStatement(selectCommand);
                    preparedStatement.setString(1, modelOfCar);
                    preparedStatement.setInt(2, yearOfCar);
                    ResultSet rs = preparedStatement.executeQuery();

                    while (rs.next()) {
                        System.out.println(rs.getString("Model") + " "
                                + rs.getString("year_") + " "
                                + rs.getString("owner_"));
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Driver connection failed...");
            ex.printStackTrace();
        }
    }
}
