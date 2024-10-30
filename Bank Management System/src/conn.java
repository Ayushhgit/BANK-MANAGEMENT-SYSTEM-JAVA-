
import java.sql.*;

public class conn {
    Connection connection;
    Statement statement;
    public conn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","root123");
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
