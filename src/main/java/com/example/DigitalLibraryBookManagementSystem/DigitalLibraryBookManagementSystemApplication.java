package com.example.DigitalLibraryBookManagementSystem;

import com.example.DigitalLibraryBookManagementSystem.Entities.Book;
import com.example.DigitalLibraryBookManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DigitalLibraryBookManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalLibraryBookManagementSystemApplication.class, args);
	}

//	@Bean
//	CommandLineRunner initDatabase(@Autowired BookRepository bookRepository) {
//		return args -> {
//			bookRepository.save(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "Available"));
//			bookRepository.save(new Book("B002", "To Kill a Mockingbird", "Harper Lee", "Classic", "Checked Out"));
//		};
//	}

}
