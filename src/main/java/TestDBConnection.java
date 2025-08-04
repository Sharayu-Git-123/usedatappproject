import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "admin"; // replace with your actual password

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("✅ Connected successfully to MySQL!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Failed to connect: " + e.getMessage());
        }
    }
}