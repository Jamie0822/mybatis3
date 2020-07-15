package org.apache.ibatis.demo.mybatis.dataobject;

import lombok.Builder;
import lombok.Data;

/**
 * TODO
 *
 * @author <a href="mailto:zht@orientdata.cn"> zht </a>
 * @since
 */
@Data
@Builder
public class BuilderDO {

    private Integer id;

    private Integer name;

    private Integer age;

}
