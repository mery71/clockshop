package com.lacnt.clock.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import com.lacnt.clock.dao.CategoryDao;
import com.lacnt.clock.model.Category;

@Service
public class CategoryServiceImp implements CategoryService {
//	@Autowired
//	DataSource datasource;
//	
	private CategoryDao categoryDao = new CategoryDao();
//
//	@PostConstruct
//	private void intialize() {
//		setDataSource(datasource);
//	}

	@Override
	public List<Category> getAllCategory() {
		return categoryDao.getAllCategory();
	}

	@Override
	public void addCategory(Category category) {
//		String sql = "INSERT into category (name) values (?)";
//		getJdbcTemplate().update(sql, new Object[] { category.getName() });
	}

	@Override
	public void updateCategory(Category category) {
//		String sql = "UPDATE category SET name = ? where id_category= ?";
//		getJdbcTemplate().update(sql, new Object[] { category.getName(), category.getId_category()});
	}

	@Override
	public Category findCategoryById(int id_category) {
//		String sql = "SELECT *FROM category where id_category=?";
//		return (Category) getJdbcTemplate().queryForObject(sql, new Object[] { id_category },
//				new RowMapper<Category>() {
//
//					@Override
//					public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
//						Category cate = new Category();
//						cate.setId_category(rs.getInt("id_category"));
//						cate.setName(rs.getString("name"));
//						return cate;
//					}
//
//				});
		return null;
	}

	@Override
	public void deleteCategory(int id_category) {
//		String sql = "UPDATE product SET isdelete = 1 where id_category= ?";
//		String sql1 = "UPDATE category SET isdelete = 1 where id_category= ?";
//		getJdbcTemplate().update(sql, id_category);
//		getJdbcTemplate().update(sql1, id_category);

	}
}
