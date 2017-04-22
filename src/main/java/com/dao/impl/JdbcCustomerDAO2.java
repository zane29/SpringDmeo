package com.dao.impl;

import com.dao.CustomerDAO;
import com.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import javax.sql.rowset.FilteredRowSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 14:35
 */

/**
 * 如果不用JdbcTemplate，必须创建大量的冗余代码(创建连接，关闭连接，处理异常)中的所有DAO数据库的操作方法 - 插入，更新和删除。
 * 它的效率并不是很高，容易出错和乏味。
 * 使用JdbcTemplate可节省大量的冗余代码，因为JdbcTemplate类会自动处理它。
 */
public class JdbcCustomerDAO2 implements CustomerDAO {

    private JdbcTemplate jdbcTemplate;

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(Customer customer) {

        String sql = "INSERT INTO CUSTOMER " +
                "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(sql, new Object[]{customer.getCustId(),
                customer.getName(), customer.getAge()
        });

    }

    @Override
    public Customer findByCustomerId(int custId) {
        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
        Customer customer = null;
        jdbcTemplate = new JdbcTemplate(dataSource);
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql, custId);
        Map map = mapList.get(0);
        customer = new Customer();
        customer.setAge(Integer.valueOf(map.get("Age").toString()));
        customer.setName((String) map.get("NAME"));
        customer.setCustId(Integer.valueOf(map.get("CUST_ID").toString()));

        return customer;


    }
}
