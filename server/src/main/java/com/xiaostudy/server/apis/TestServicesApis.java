package com.xiaostudy.server.apis;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "server-service", contextId = "TestServicesApis")
public interface TestServicesApis {

    @RequestMapping("/test/get")
    String get(String name);

}