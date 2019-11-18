package com.codetest.experiment.code_test_java.repositories;

import com.codetest.experiment.code_test_java.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
