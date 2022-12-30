package com.itheima.service;

import com.itheima.mapper.BrandMapper;
import com.itheima.pojo.Brand;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
//    SqlSessionFactory是一个接口，接口中定义了openSession的不同重载方法，
//    SqlSessionFactory的最佳使用范围是整个应用运行期间，一旦创建后可以重复使用，
//    通常以单例模式管理SqlSessionFactory


    /**
     * 查询所有
     *
     * @return
     */
    public List<Brand> selectAll() {
        //调用BrandMapper.selectAll()

        //2. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //3. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4. 调用方法
        List<Brand> brands = mapper.selectAll();

        sqlSession.close();

        return brands;
    }

    /**
     * 添加
     *
     * @param brand
     */
    public void add(Brand brand) {

        //2. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //3. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4. 调用方法
        mapper.add(brand);

        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();

    }


    /**
     * 根据id查询
     *
     * @return
     */
    public Brand selectById(int id) {
        //调用BrandMapper.selectAll()

        //2. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //3. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4. 调用方法
        Brand brand = mapper.selectById(id);

        sqlSession.close();

        return brand;
    }


    /**
     * 修改
     *
     * @param brand
     */
    public void update(Brand brand) {

        //2. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //3. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4. 调用方法
        mapper.update(brand);

        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();

    }
}
