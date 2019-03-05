package com.chen.test;

import java.util.ServiceLoader;

public class Test {
    public static void main(String[] args) throws Exception {
        HelloService service= (HelloService) Class.forName("com.chen.test.impl.HelloServicImplOne").newInstance();
        service.say();
    }
}
