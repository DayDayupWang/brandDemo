package com.itheima.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        //静态代码块会随着类的加载而自动执行，且只执行一次
        //先去执行父类中的静态代码块，然后再执行子类中的静态代码块，
        // 当所有的静态代码块都执行结束后会执行main函数中的输出语句
        // （前提是输出语句在new StaticTest()之前），然后会去执行父类中的非静态代码块，
        // 接着是父类中的构造方法，紧接着执行子类中的非静态代码块，最后是子类中的构造方法，完事！

        //执行一次并创建出SqlSessionFactory
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
