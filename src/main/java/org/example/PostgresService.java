package org.example;

import org.springframework.stereotype.Service;
import java.sql.*;

@Service
public class PostgresService {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public String findMaxTestValueByMessage(String message) {
        if (message == null) return null;
        String result = null;
        String sql = "SELECT test_value FROM test_table WHERE kafka_messages LIKE ? ORDER BY id DESC LIMIT 1";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + message + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = rs.getString("test_value");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}

