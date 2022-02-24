package com.wakshum.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.wakshum")
@ComponentScan(basePackages = {"com.wakshum.proxy","com.wakshum.service","com.wakshum.repository"})
public class ProjectConfig {
}
