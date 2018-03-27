package com.lwc.service;

/**
 * @author eddie.lee
 * @Package com.lwc.service
 * @ClassName RibbonService
 * @description
 * @date created in 2018-03-26 19:55
 * @modified by
 */
public interface RibbonService {

    String ribbonService(String name);

    /**
     * Hystrix 熔断 返回错误信息
     */
    String hystrixError(String name);
}
