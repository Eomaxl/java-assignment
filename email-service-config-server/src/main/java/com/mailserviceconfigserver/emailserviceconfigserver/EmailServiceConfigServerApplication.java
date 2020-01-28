package com.mailserviceconfigserver.emailserviceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableConfigServer
@SpringBootApplication
public class EmailServiceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceConfigServerApplication.class, args);
	}

}
