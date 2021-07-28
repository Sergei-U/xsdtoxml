import Config.CustomSQLErrorCodeTranslator;
import com.zaxxer.hikari.HikariConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DrManager {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private SimpleJdbcInsert simpleJdbcInsert;
    private SimpleJdbcCall simpleJdbcCall;

    private String connectionUrl = "jdbc:jtds:sqlserver://SWEBAP01:1433;databaseName=REFIRA_COM;domain=REKSOFT;USENTLMV2=true";
    private String userName = "usov";
    private String pass = "S";

    private HikariConfig config = new HikariConfig();


    public String getDataSource(final DataSource dataSource){

        jdbcTemplate = new JdbcTemplate(dataSource);
        final CustomSQLErrorCodeTranslator customSQLErrorCodeTranslator = new CustomSQLErrorCodeTranslator();
        jdbcTemplate.setExceptionTranslator(customSQLErrorCodeTranslator);

        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        System.out.println(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM getDocument", String.class));
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM getDocument", String.class);


    }


    public void manager()  {

        config.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");
        try {
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl, userName, pass)) {

                String sql = "SELECT 'Document No_', 'Description', 'Description 2' FROM 'dbo.getDocument';";
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

