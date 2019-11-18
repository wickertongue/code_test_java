package com.codetest.experiment.code_test_java.components;

import com.codetest.experiment.code_test_java.models.Product;
import com.codetest.experiment.code_test_java.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ProductRepository productRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        // products

        Product heart = new Product("Lavendar Heart", 925);
        productRepository.save(heart);

        Product cufflinks = new Product("Personalised Cufflinks", 4500);
        productRepository.save(cufflinks);

        Product shirt = new Product("Kids T-shirt", 1995);
        productRepository.save(shirt);

    }

}
