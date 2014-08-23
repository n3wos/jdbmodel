
package com.jdbmodel.dao.reverse;

import com.jdbmodel.dao.DbProfile;
import com.jdbmodel.dao.Schema;
import java.sql.SQLException;

public class ReverseEngineer {
    
    public static Schema reverse(DbProfile profile) throws SQLException {
        //TODO: make this configurable
        if (profile.getType().equals("MySQL")) {
            return ReverseMySQL.reverse(profile);
        } else if (profile.getType().equals("Oracle")) {
            return ReverseOracle.reverse(profile);
        }
        
        throw new SQLException("Unknown type: " + profile.getType());
    }
}
