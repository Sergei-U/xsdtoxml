import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DrManager {
    public void manager() {
        String connectionUrl = "jdbc:jtds:sqlserver://SWEBAP01:1433;databaseName=REFIRA_COM;domain=REKSOFT;USENTLMV2=true";
        String userName = "usov";
        String pass = "S";
        try {
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl, userName, pass)) {
                System.out.println("Done.");

                System.out.print("Reading data from table, press ENTER to continue...");
                System.in.read();
                String sql = "SELECT 'Document No_', 'Description', 'Description 2' FROM getDocument;";
                try (Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(sql)) {
                    while (resultSet.next()) {
                        System.out.println(
                                resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                    }
                }
                connection.close();
                System.out.println("All done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
    }
}

