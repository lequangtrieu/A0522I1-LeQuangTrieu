import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("12345678");
        ds.setServerName("QUANG-TRIEU\\QUANG_TRIEU");
        ds.setPortNumber(1433);
        ds.setDatabaseName("student_management");

        try (Connection con = ds.getConnection()) {
            System.out.println("connect success");
            System.out.println(con.getMetaData());
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
