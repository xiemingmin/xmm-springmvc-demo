package com.xiemingmin.web.person;

import com.xiemingmin.domain.dao.PersonDo;
import com.xiemingmin.service.Person.PersonService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: xiemingmin
 * @Description:
 * @Date: 2018/9/10 22:24
 */
@RestController
@RequestMapping("/rest/person")
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping("/getPerson/{name}")
    public List<PersonDo> getPerson(@PathVariable String name){
        return personService.findPersonByName(name);
    }
}
