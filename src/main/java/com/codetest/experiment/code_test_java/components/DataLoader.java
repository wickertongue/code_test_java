package com.codetest.experiment.code_test_java.components;

import com.codetest.experiment.code_test_java.models.Product;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {



    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        // products

        Product heart = new Product("Lavendar Heart", 925);
        // save
        Product cufflinks = new Product("Personalised Cufflinks", 4500);
        // save
        Product shirt = new Product("Kids T-shirt", 1995);
        // save


    }

}
