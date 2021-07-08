package com.avaliacao.avaliacao.Product;

import com.avaliacao.avaliacao.Company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCompany(Company company);
}
