package com.mzvzm.provider;

public class Provider1 implements com.mzvzm.spi.Service {
    /**
     * 提供服务实现1
     * 并且在META-INF -> services -> com.mzvzm.spi.Service文件中添加当前类的全路径名
     * @param name
     * @return
     */
    @Override
    public String getService(String name) {
        System.out.println("provider1::service");
        return name;
    }
}
