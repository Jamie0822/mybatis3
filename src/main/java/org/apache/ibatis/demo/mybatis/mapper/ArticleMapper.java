package org.apache.ibatis.demo.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.demo.mybatis.dataobject.ArticleDO;

/**
 * TODO
 *
 * @author <a href="mailto:zht@orientdata.cn"> zht </a>
 * @since
 */
public interface ArticleMapper {

    ArticleDO findById(@Param("id") Integer id);

}
