package com.livetechstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LibraryConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryConfigServerApplication.class, args);
	}

}
