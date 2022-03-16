package com.example.springrestapi.database;

import com.example.springrestapi.Entity.Product;
import com.example.springrestapi.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                Product productA = new Product("Macbook Pro",2020,2400.00,"");
//                Product productB = new Product("Macbook Pro",2022,2500.00,"");
//                productRepository.save(productA);
//                productRepository.save(productB);
            }
        };
    }
}
