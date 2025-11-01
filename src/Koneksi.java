import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:kontak.db"; // pastikan file kontak.db di folder project
            conn = DriverManager.getConnection(url);
            System.out.println("Koneksi berhasil ke database!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}