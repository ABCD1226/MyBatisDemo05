package com.eec.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.eec.dao.BusinessDao;
import com.eec.entity.Business;

public class Test1 {

	@Test
	public void test() {
		// 加载mybatis-config.xml全局配置文件
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// 创建会话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 创建接口代理对象
		BusinessDao dao = sqlSession.getMapper(BusinessDao.class);
		// 执行相关操作
		Business bus = dao.getObjectById(1002);
		System.out.println(bus);
		// 关闭会话
		sqlSession.close();
	}

}
