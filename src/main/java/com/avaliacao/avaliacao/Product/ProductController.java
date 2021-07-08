package com.avaliacao.avaliacao.Product;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("product")
public class ProductController {
    @Autowired
    private final ProductService productService;

    @PostMapping("{companyId}")
    public ResponseEntity<Product> save(@RequestBody Product product, @PathVariable("companyId") Long companyId){
        Product product1 = productService.save(companyId, product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @GetMapping("{companyId}")
    public ResponseEntity<List<Product>> findProductByCompany(@PathVariable("companyId") Long companyId){
        List<Product> products = productService.findProductByCompany(companyId);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
