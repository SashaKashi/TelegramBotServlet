package DBUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://35.195.218.82:5432/postgres", "sasha",
                "sasha");
        con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

        return con;
    }
}
