package com.avaliacao.avaliacao.Product;

import com.avaliacao.avaliacao.Company.Company;
import com.avaliacao.avaliacao.Company.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CompanyService companyService;

    public Product save(Long companyId, Product product){
        Company company = companyService.findById(companyId);
        product.setCompany(company);
        return productRepository.save(product);
    }

    public List<Product> findProductByCompany(Long companyId){
        Company company = companyService.findById(companyId);
        List<Product> products = productRepository.findByCompany(company);
        return products;
    }
}