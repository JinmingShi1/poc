package com.poc.dao.impl;

import com.poc.Entity.UserInfo;
import com.poc.dao.UserDAO;
import com.poc.dto.UserDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserDTO findById(Long id) {
        String sql = "select * from users where id= ?";

        return (UserDTO)getJdbcTemplate().queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(UserDTO.class)) ;
    }

    @Override
    public List<UserDTO> findAllUser() {
        String sql = "SELECT * FROM users";

        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<UserDTO> result = new ArrayList<>();
        for(Map<String, Object> row:rows){
            UserDTO tmp = new UserDTO();
            tmp.setAddress((String)row.get("address"));
            tmp.setEmail((String)row.get("email"));
            tmp.setCity((String)row.get("city"));
            tmp.setUsername((String)row.get("username"));
            tmp.setPhoneNum((String)row.get("phoneNum"));
            tmp.setSsn((String)row.get("ssn"));
            result.add(tmp);
        }
        return result;
    }

    @Override
    public Long updateUser(UserInfo userInfo) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(userInfo);
        session.getTransaction().commit();
        session.close();
        return userInfo.getId();
    }

    @Override
    public Long deleteUserById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(session.get(UserInfo.class, id));
        session.getTransaction().commit();
        session.close();
        return id;
    }
}
