package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//启动服务注册中心，提供给其他应用
@SpringBootApplication//springboot的组合注解：配置类、自动配置、组件扫描
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}
