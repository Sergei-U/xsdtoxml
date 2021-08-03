package service;

import com.zaxxer.hikari.HikariConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DataProcedureManager {


    private HikariConfig config = new HikariConfig();

    Map<String, Object> mapDataProcedure = new HashMap<>();


    public Map<String, Object> getDataOnProcedureManager() {

        Properties property = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
        } catch (FileNotFoundException e) {
            System.out.println("config.properties file not found");
            e.printStackTrace();
        }
        try {
            property.load(fis);
        } catch (IOException e) {

            e.printStackTrace();
        }
        String connectionUrl = property.getProperty("db.host");
        String userName = property.getProperty("db.login");
        String pass = property.getProperty("db.password");


        config.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");

        try {
            System.out.println("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl, userName, pass)) {
                System.out.println("Retrieving procedure data from the database...");
                String sql = "exec dbo.getDocument @DocumentType = 2, @DocumentNo='401-256/16'";

                try (Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(sql)) {
                    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                    int column = resultSetMetaData.getColumnCount();
                    while (resultSet.next()) {

                        for (int j = 1; j < column; j++) {
                            mapDataProcedure.put(resultSetMetaData.getColumnName(j), resultSet.getObject(j));
                        }
                    }

                    System.out.println("Quantity mapDataProcedure.size= " + mapDataProcedure.size() + " " + mapDataProcedure);
                }
                connection.close();

                System.out.println("All done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        return mapDataProcedure;
    }
}

