package com.xiemingmin.service;

import com.mm.call.limit.intf.UserInfoSupport;
import org.springframework.stereotype.Service;

/**
 * @Auther: xiemingmin
 * @Description:
 * @Date: 2020/5/5 02:55
 */
@Service
public class UserInfoServiceImpl implements UserInfoSupport {

    public String currentUserKey() {
        return "xmm";
    }
}
