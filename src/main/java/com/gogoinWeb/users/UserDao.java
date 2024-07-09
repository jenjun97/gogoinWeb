package com.gogoinWeb.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public List<UserModel> findUserById(Integer id) {
		String sql = "SELECT id, uname FROM t_users WHERE id >= :id";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);
		return jdbcTemplate.query(sql, params, new BeanPropertyRowMapper<>(UserModel.class));
	}
}
