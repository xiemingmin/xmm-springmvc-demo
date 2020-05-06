package com.xiemingmin.web.person;

import com.mm.call.limit.annotation.CallLimit;
import com.xiemingmin.domain.dao.PersonDo;
import com.xiemingmin.service.Person.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @GetMapping("/getPerson/{name}")
    @CallLimit(time = 30, timeUnit = TimeUnit.SECONDS)
    public List<PersonDo> getPerson(@PathVariable String name){
//        return personService.findPersonByName(name);
        return null;
    }
}
