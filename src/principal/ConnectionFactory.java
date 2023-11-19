package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	 public static Connection getConnection() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            String url = "jdbc:mysql://localhost:3306/projetoorcamento";
	            String usuario = "root";
	            String senha = "D123456";
	            return DriverManager.getConnection(url, usuario, senha);
	        } catch (ClassNotFoundException | SQLException e) {
	            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage());
	        }
	    }

}
