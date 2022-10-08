package com.example.bc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class TransactionDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    String saveTransaction() {

        String sql = "inert into Employee values(:value1, :value1)";

        String sql2 = "inert into Employee values(?, ?)";

        Map<String, Object> params = new HashMap<>();
        params.put("var1", "name");
        params.put("var2", "id");

        jdbcTemplate.update(sql, params);
        return "succes";
    }

}
