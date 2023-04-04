package com.baeldung.multipledb;

import com.baeldung.multipledb.dao.product.ProductRepository;
import com.baeldung.multipledb.dao.user.UserRepository;
import com.baeldung.multipledb.model.product.Product;
import com.baeldung.multipledb.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MultipleDbApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(MultipleDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("christopher");
        user.setAge(10);
        user.setEmail("mail@gmail.com");
        //user.setPossessionList(possessionList);
        userRepository.save(user);

        Product product = new Product();
        product.setName("plancha");
        product.setPrice(80);
        productRepository.save(product);

    }
}