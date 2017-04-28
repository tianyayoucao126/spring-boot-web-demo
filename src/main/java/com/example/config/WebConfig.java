package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 菩提树下的杨过 on 2017/4/15.
 */
@Data
@Component
@ConfigurationProperties(prefix = "web.config")
public class WebConfig {

    private String webTitle;

    private String authorName;

    private String authorBlogUrl;


}
