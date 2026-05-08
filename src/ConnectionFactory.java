import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // Ajuste a porta (3306) se o seu MySQL rodar em uma porta diferente
    private static final String URL = "jdbc:mysql://localhost:3306/diario_treino";
    private static final String USER = "root";
    private static final String PASS = "";
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }
}