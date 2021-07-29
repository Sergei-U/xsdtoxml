package Service;

import Config.CustomSQLErrorCodeTranslator;
import com.zaxxer.hikari.HikariConfig;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

public class DrManager {

    private String connectionUrl = "jdbc:jtds:sqlserver://SWEBAP01:1433;databaseName=REFIRA_COM;domain=REKSOFT;USENTLMV2=true";
    private String userName = "usov";
    private String pass = "Swizze2010%%";

    private HikariConfig config = new HikariConfig();

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private SimpleJdbcInsert simpleJdbcInsert;
    private SimpleJdbcCall simpleJdbcCall;

    public String getDataSource(final DataSource dataSource) {

        jdbcTemplate = new JdbcTemplate(dataSource);
        final CustomSQLErrorCodeTranslator customSQLErrorCodeTranslator = new CustomSQLErrorCodeTranslator();
        jdbcTemplate.setExceptionTranslator(customSQLErrorCodeTranslator);
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        return jdbcTemplate.queryForObject("exec dbo.getDocument @DocumentType = 2, @DocumentNo='401-270/10'", String.class);
    }


    public Map<String, Object> getDataOnProcedureManager() {

        Map<String, Object> mapDataProcedure = new HashMap<>();

        config.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");

        try {
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl, userName, pass)) {

                String sql = "exec dbo.getDocument @DocumentType = 2, @DocumentNo='401-270/10'";

                try (Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(sql)) {
                    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                    int column = resultSetMetaData.getColumnCount();
//                    for (int i = 1; i < column; i++) {
//                        String name = resultSetMetaData.getColumnName(i);
//                        int typeColumn = resultSetMetaData.getColumnType(i);
//                        System.out.println("Name column #" + i + " = " + name + " | typeColumn: " + typeColumn);
//                    }
                    while (resultSet.next()) {

                        for(int j =1; j<column; j++) {

                            mapDataProcedure.put(resultSetMetaData.getColumnName(j), resultSet.getObject(j));

                        }
                    }

                    System.out.println("Quantity mapDataProcedure.size= "+mapDataProcedure.size()+" "+mapDataProcedure);
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

