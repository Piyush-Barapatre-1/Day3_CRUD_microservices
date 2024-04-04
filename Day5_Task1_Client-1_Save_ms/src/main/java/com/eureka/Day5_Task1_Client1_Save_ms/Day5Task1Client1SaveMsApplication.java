package com.eureka.Day5_Task1_Client1_Save_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Day5Task1Client1SaveMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day5Task1Client1SaveMsApplication.class, args);
	}

}
