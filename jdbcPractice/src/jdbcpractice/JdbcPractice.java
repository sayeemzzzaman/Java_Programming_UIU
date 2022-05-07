/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author sayeem
 */
public class JdbcPractice {

    /**
     * @param args the command line arguments
     */
    private static final String USERNAME = "sayeem";
    private static final String PASSWORD = "57639713";
    private static final String CONN = "jdbc:mysql://localhost/school";
    public static void main(String[] args) throws SQLException {
        
        //Class.forName(com.mysql.jdbc.Driver);
        
        Connection con = null;
        try{
            con = DriverManager.getConnection(CONN,USERNAME,PASSWORD);
            System.out.println("Connected");
        } catch (SQLException e){
            System.out.println(e);
        }
        finally {
            if(con != null){
                con.close();
            }
        }
    }
    
}
