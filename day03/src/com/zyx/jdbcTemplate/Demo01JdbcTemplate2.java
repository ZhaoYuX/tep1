package com.zyx.jdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zyx.bean.User;
import com.zyx.druid.jdbcutils;

public class Demo01JdbcTemplate2 {
	public static void main(String[] args) {
		//addUser1();
		 //updateUser();
		 //deleteUser();
		// deleteUser1();
		//findUserById1();
		findUserById();

	}
	//查询所有
	public static void findUserById() {
		JdbcTemplate jt = new JdbcTemplate(jdbcutils.getDataSource());
		String sql = " SELECT *from person";
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(
				User.class));

		for (User user : list) {
			System.out.println(user);
		}
	}
	
	
	// 添加"( '2','赵育新','zyx','1205','21','学生1','175')," +
	/* * "( '3','姚志鑫','yzx','1927','20','学生2','182')," +
	 * "( '4','张赫天','zht','0405','22','学生3','176')," +
	 * "( '5','赵蕊','zr','0608','18','学生4','165');";*/
	//添加
	 public static void addUser1(){ JdbcTemplate jt1 = new
	 JdbcTemplate(jdbcutils.getDataSource());
	 
	 String sql1 = "insert into person values" +
	 "( '2','赵四','zyx','1205','21','学生1','175')," +
	 "( '3','王五','yzx','1927','20','学生2','182')," +
	  "( '4','樊松然','zht','0405','22','学生3','176')," +
	  "( '5','李四','zr','0608','18','学生4','165');"; 
	 int update =jt1.update(sql1); System.out.println(update); }
	// 修改
	
	  public static void updateUser(){ JdbcTemplate jt2 = new
	  JdbcTemplate(jdbcutils.getDataSource());
	  
	  int update = jt2.update("update person set name=? where id=?","樊然",2);
	  System.out.println(update); }
	
	// id删除
	
	 public static void deleteUser(){ JdbcTemplate jt3 = new
	 JdbcTemplate(jdbcutils.getDataSource());
	 
	 int update = jt3.update("delete from person where id=?",2);
	 System.out.println(update); }
	
	//姓名删除
	 public static void deleteUser1(){ JdbcTemplate jt4 = new
	 JdbcTemplate(jdbcutils.getDataSource());
	 
	 String sql4 ="delete from person where name='赵蕊'"; int delete =
	 jt4.update(sql4); System.out.println(delete); }
	 
	//单个查找
	public static void findUserById1() {
		JdbcTemplate jt5 = new JdbcTemplate(jdbcutils.getDataSource());
		String sql5 = " SELECT *from person where id='3'";
		List<User> list = jt5.query(sql5, new BeanPropertyRowMapper<User>(
				User.class));

		for (User user : list) {
			System.out.println(user);
		}
	}
}
