package com.ws;

import javax.jws.WebService;
import java.util.Date;

/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/22
 * @Time: 14:41
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.ws.HelloWorld",serviceName = "HelloWorldImpl")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHi(String name) {
        return  name+"Hello，Now Time:"+new Date();
    }
}
