package com.xiemingmin.domain.dao;

import lombok.Builder;
import lombok.Data;

/**
 * @Auther: xiemingmin
 * @Date: 2018/9/10 22:00
 * @Description:
 */
@Data
@Builder
public class PersonDo {
    /**
     * id主键
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

}
