/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author leleb
 */
public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException {    
       
       String driver = "com.mysql.jdbc.Driver"; 
       String url = "jdbc:mysql://143.106.241.3:3306/cl200475";
       String usuario = "cl200475";
       String senha = "cl*20092002";
       Class.forName(driver);
       return (Connection) DriverManager.getConnection(url, usuario, senha);
         
    }
}
