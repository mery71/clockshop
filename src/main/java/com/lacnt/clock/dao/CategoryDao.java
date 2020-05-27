package com.lacnt.clock.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.lacnt.clock.model.Category;


public class CategoryDao extends JdbcDaoSupport  {
	@Autowired
	DataSource datasource;

	@PostConstruct
	private void intialize() {
		setDataSource(datasource);
	}
	
	public CategoryDao() {
		
	}

	public List<Category> getAllCategory() {
		String sql = "SELECT * FROM category where isdelete=0";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		List<Category> result = new ArrayList<Category>();
		for (Map<String, Object> row : rows) {
			Category cate = new Category();
			cate.setId_category((Integer) row.get("id_category"));
			cate.setName((String) row.get("name"));
			cate.setIsdelete((Integer) row.get("isdelete"));
			result.add(cate);
		}
		return result;
	}
}
