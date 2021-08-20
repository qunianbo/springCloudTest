package com.xiaostudy.server.services.impl;

import com.xiaostudy.server.services.TestServices;
import org.springframework.stereotype.Service;

/**
 * @author : qnb
 * 2021/08/20 17:35
 */
@Service
public class TestServicesImpl implements TestServices {

    @Override
    public String get(String name) {
        return "参数name：" + name;
    }

}
