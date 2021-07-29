package Service;

import com.zaxxer.hikari.HikariConfig;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DataProcedureManager {

    private String connectionUrl = "jdbc:jtds:sqlserver://SWEBAP01:1433;databaseName=REFIRA_COM;domain=REKSOFT;USENTLMV2=true";
    private String userName = "usov";
    private String pass = "Swizze2010%%";

    private HikariConfig config = new HikariConfig();

    Map<String, Object> mapDataProcedure = new HashMap<>();

    public Map<String, Object> getDataOnProcedureManager() {

        config.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");

        try {
            System.out.println("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl, userName, pass)) {
                System.out.println("Retrieving procedure data from the database...");
                String sql = "exec dbo.getDocument @DocumentType = 2, @DocumentNo='401-270/10'";

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

