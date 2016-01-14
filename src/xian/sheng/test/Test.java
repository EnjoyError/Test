package xian.sheng.test;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		JdbcTemplate template = new JdbcTemplate((DataSource) ac.getBean("dataSource"));
		String sql = "CREATE table USER (ID INT PRIMARY KEY ,"
				+ "USERNAME VARCHAR(30))";
		template.execute(sql);
		System.out.println("helloworld");
	}
}
