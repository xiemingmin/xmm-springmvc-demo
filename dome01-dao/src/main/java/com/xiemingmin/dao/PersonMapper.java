package com.xiemingmin.dao;

import com.xiemingmin.domain.dao.PersonDo;

import java.util.List;

/**
 * @Auther: xiemingmin
 * @Date: 2018/9/10 22:08
 * @Description:
 */
public interface PersonMapper {

    List<PersonDo> findPersonByName(String name);

}
