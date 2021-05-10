package com.wge.run;

import com.wge.dao.User;
import com.wge.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class RunTest {
    public static void main(String[] args) throws IOException {
        String fileName = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(fileName);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();

        map.put("id", 1);

        User user = mapper.selectUser(map);

        System.out.println(user);

        session.close();
    }
}
