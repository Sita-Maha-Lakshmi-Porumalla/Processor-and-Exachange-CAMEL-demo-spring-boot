package com.rame.demospringboot;


import com.rame.demospringboot.model.Customer;
import com.rame.demospringboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootApplication {

	@Autowired
	private CustomerRepository custRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}


	@Bean
	public CommandLineRunner insertRecords() {
		return (args) -> {
			// insert records
			custRepo.save(new Customer("Sita", "Maha"));
			custRepo.save(new Customer("Lakshmi", "Porumalla"));
			custRepo.save(new Customer("Bill", "Gates"));
			custRepo.save(new Customer("Rob", "Johnson"));
			custRepo.save(new Customer("Jeff", "Bezos"));
		};
	}
}
