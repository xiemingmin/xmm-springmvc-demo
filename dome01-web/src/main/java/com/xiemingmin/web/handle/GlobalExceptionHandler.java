package com.xiemingmin.web.handle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: xiemingmin
 * @Description: 统一异常处理
 * @Date: 2019/12/3 23:30
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> globalExceptionHandler(Exception e) throws Exception {
        log.error("GlobalExceptionHandler.globalExceptionHandler 错误信息", e);
        Map<String, Object> map = new HashMap<>();
        map.put("success", false);
        map.put("code", 500);
        map.put("message", e.getMessage());
        return map;
    }

}
