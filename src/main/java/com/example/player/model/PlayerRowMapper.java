package com.example.player.model;

/*
 * You can use the following import statements
 * 
 * import java.sql.ResultSet;
 * import java.sql.SQLException;
 * import org.springframework.jdbc.core.RowMapper;
 * 
 */

// Write your code here 

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PlayerRowMapper implements RowMapper<Player>{

    @Override 
    public Player mapRow(ResultSet rs, int rowNum) throws SQLException{
        return new Player(
            rs.getInt("playerId"),
            rs.getString("playerName"),
            rs.getInt("jerseyNumber"),
            rs.getString("role")
        );
    }
}
