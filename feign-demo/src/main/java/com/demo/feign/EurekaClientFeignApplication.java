package com.demo.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientFeignApplication.class, args);
	}
}
