package org.apache.ibatis.demo.mybatis.service;

import org.apache.ibatis.demo.mybatis.dataobject.ArticleDO;
import org.apache.ibatis.demo.mybatis.mapper.ArticleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * TODO
 *
 * @author <a href="mailto:zht@orientdata.cn"> zht </a>
 * @since
 */
public class ArticleService {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void createSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
    }

    // Error:java: Compilation failed: internal java compiler error

    @Test
    public void testMyBatis() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            ArticleMapper articleMapper = session.getMapper(ArticleMapper.class);
            ArticleDO articleDO = articleMapper.findById(1);
            System.out.println(articleDO.toString());
        }
    }

}
