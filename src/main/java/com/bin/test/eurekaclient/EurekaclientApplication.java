package com.bin.test.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
/*@EnableEurekaClient*/
@EnableDiscoveryClient
public class EurekaclientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EurekaclientApplication.class, args);
	}
	
}
