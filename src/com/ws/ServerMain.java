package com.ws;

import javax.xml.ws.Endpoint;

/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/22
 * @Time: 14:44
 * To change this template use File | Settings | File Templates.
 */
public class ServerMain  {

    public static void main(String[] args) {
        HelloWorld hw=new HelloWorldImpl();
        Endpoint.publish("http://192.168.1.161:9999/vashon",hw);
        System.out.println("Web Service发布成功");
    }
}
