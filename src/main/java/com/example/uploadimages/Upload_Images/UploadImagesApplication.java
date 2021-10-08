package com.example.uploadimages.Upload_Images;

import com.example.uploadimages.Upload_Images.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class UploadImagesApplication implements CommandLineRunner {

	@Autowired
	FileStorageService fileStorageService;

	public static void main(String[] args) {
		SpringApplication.run(UploadImagesApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		fileStorageService.deleteAll();
		fileStorageService.init();
	}
}
