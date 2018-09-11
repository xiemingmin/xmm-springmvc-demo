package com.xiemingmin.service.Person.impl;

import com.xiemingmin.dao.PersonMapper;
import com.xiemingmin.domain.dao.PersonDo;
import com.xiemingmin.service.Person.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: xiemingmin
 * @Description:
 * @Date: 2018/9/10 22:17
 */
@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonMapper personMapper;

    public List<PersonDo> findPersonByName(String name) {
        log.info("查询person，name = {}",name);
        return personMapper.findPersonByName(name);
    }
}
