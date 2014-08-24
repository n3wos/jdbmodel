
package com.jdbmodel.dao.reverse;

import com.jdbmodel.dao.DbProfile;
import com.jdbmodel.dao.Schema;
import java.sql.SQLException;

public class ReverseOracle {
    
    public static Schema reverse(DbProfile profile) throws SQLException {
        /*Class.forName("oracle.jdbc.driver.OracleDriver");
		
        try {
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:sid","username","password");

        } catch (SQLException e) {
                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
                return;
        } finally {
                connection.close();
        }*/
        return null;
    }
}
