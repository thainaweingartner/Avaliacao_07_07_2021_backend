package com.avaliacao.avaliacao.Company;

import com.avaliacao.avaliacao.Product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Long cnpj;
    private String phone;
    private String city;
    private String street;
    private String number;
    private String cep;

    @OneToMany(mappedBy = "company")
    private List<Product> products;
}
