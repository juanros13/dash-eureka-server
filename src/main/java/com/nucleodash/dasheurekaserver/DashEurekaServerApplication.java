package com.nucleodash.dasheurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DashEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashEurekaServerApplication.class, args);
	}

}
