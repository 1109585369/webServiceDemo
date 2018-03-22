package com.ws;

import javax.jws.WebService;

/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/22
 * @Time: 14:36
 * To change this template use File | Settings | File Templates.
 */

@WebService
public interface HelloWorld {

    String sayHi(String name);

}
