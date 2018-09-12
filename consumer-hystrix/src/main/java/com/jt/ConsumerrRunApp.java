package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
@SpringCloudApplication
@EnableFeignClients
public class ConsumerrRunApp {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerrRunApp.class, args);
	}
}
