package com.xiemingmin.service;

import org.springframework.stereotype.Service;
import top.xiemingmin.call.limit.intf.UserInfoSupport;

/**
 * @Auther: xiemingmin
 * @Description:
 * @Date: 2020/5/5 02:55
 */
@Service
public class UserInfoServiceImpl implements UserInfoSupport {

    @Override
    public String currentUserKey() {
        return "xmm";
    }
}
