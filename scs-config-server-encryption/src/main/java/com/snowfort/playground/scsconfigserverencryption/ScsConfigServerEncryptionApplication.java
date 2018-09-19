package com.snowfort.playground.scsconfigserverencryption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ScsConfigServerEncryptionApplication {

	@Value("${secret}")
	String secret;

	public static void main(String[] args) {
		SpringApplication.run(ScsConfigServerEncryptionApplication.class, args);
	}

	@GetMapping
	public String getEncryptedSecret() {
		return "Your secret is:  " + secret;
	}
}
