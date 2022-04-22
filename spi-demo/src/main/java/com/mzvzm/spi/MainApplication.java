package com.mzvzm.spi;

import java.util.ServiceLoader;

public class MainApplication {
    public static void main(String[] args) {
        ServiceLoader<Service> loader = ServiceLoader.load(Service.class);
        for (Service service : loader) {
            service.getService("spi");
            System.out.println(service.getClass());
        }
    }
}
