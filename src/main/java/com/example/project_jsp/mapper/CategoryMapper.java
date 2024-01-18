package com.example.project_jsp.mapper;

import com.example.project_jsp.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class CategoryMapper implements RowMapper<Category> {
    @Override
    public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Category(rs.getInt(1),rs.getString(2));
    }
}
