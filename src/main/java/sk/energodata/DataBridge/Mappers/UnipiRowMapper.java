package sk.energodata.DataBridge.Mappers;

import org.springframework.jdbc.core.RowMapper;
import sk.energodata.DataBridge.Models.Unipi;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UnipiRowMapper implements RowMapper<Unipi> {
    @Override
    public Unipi mapRow(ResultSet rs, int rowNum) throws SQLException {

        Unipi unipi = new Unipi();
        unipi.setId(rs.getLong("id"));
        unipi.setName("name");
        unipi.setDescription("description");

       return unipi;
    }
}
