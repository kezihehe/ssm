package com.lisk.ssm;

import com.lisk.framework.demo.domain.User;
import com.lisk.framework.demo.service.UserService;
import com.lisk.framework.demo.service.impl.UserServiceImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by zuoch on 2017/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-beans.xml","classpath:spring-mybatis.xml"})
public class SpringMybatisTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testSqlFactoryBean(){
        SqlSessionFactory sqlSessionFactory = ( SqlSessionFactory) context.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);
    }

    @Test
    public void testFindAll(){
        UserService userService=(UserService)context.getBean("userService");
        System.out.println(userService.findAll().size());
    }

    @Test
    public void testInsert(){
        UserService userService=(UserService)context.getBean("userService");
        userService.insertUser();
    }

    @Test
    public void testFindById(){
        UserService userService=(UserService)context.getBean("userService");
        User user = userService.findById(1L);
        System.out.println(user.toString());
    }

}
