package com.example.project_jsp.mapper;

import com.example.project_jsp.model.News;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsMapper implements RowMapper<News> {
    @Override
    public News mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new News(rs.getInt(1),rs.getString(2),rs.getString(3),
                rs.getDate(4),rs.getInt(5));
    }
}
