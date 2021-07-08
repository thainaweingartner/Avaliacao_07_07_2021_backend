package com.avaliacao.avaliacao.Company;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("company")
public class CompanyController {
    @Autowired
    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<Company> save(@RequestBody Company company){
        Company company1 = companyService.save(company);
        return new ResponseEntity<>(company1, HttpStatus.CREATED);
    }

    @GetMapping("{companyId}")
    public ResponseEntity<Company> findById(@PathVariable("companyId") Long companyId){
        Company company = companyService.findById(companyId);
        return new ResponseEntity<>(company, HttpStatus.OK);
    }
}