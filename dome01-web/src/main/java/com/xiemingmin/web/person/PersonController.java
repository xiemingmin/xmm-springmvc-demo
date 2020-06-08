package com.xiemingmin.web.person;

import com.xiemingmin.domain.dao.PersonDo;
import com.xiemingmin.service.Person.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xiemingmin.call.limit.annotation.CallLimit;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public Map<String, Object> getPerson(@PathVariable String name){
//        return personService.findPersonByName(name);
        List<PersonDo> result = new ArrayList<>();
        result.add(PersonDo.builder().id(111L).age(18).name("Tom").build());
        result.add(PersonDo.builder().id(112L).age(19).name("George").build());
        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        map.put("code", 200);
        map.put("data", result);
        return map;
    }
}
