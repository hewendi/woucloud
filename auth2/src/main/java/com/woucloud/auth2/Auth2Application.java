package com.woucloud.auth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Auth2Application {
	//http://www.ruanyifeng.com/blog/2014/05/oauth_2_0.html
	public static void main(String[] args) {
		SpringApplication.run(Auth2Application.class, args);
	}
}
