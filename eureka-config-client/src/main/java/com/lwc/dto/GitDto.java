package com.lwc.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author eddie.lee
 * @Package com.lwc.dto
 * @ClassName GitDto
 * @description https://github.com/eddie-code/SpringCloudDemo/tree/master/config-repo
 * @date created in 2018-04-03 14:23
 * @modified by
 */
@Repository
public class GitDto {

    @Value("${eddie}")
    private String eddie;

    @Value("${url}")
    private String url;

    public String getEddie() {
        return eddie;
    }

    public void setEddie(String eddie) {
        this.eddie = eddie;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
