package com.xiemingmin.service.Person;

import com.xiemingmin.domain.dao.PersonDo;

import java.util.List;

/**
 * @Auther: xiemingmin
 * @Description: person接口
 * @Date: 2018/9/10 22:14
 */
public interface PersonService {

    List<PersonDo> findPersonByName(String name);
}
