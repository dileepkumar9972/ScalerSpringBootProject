package com.ecom.productservice.Product.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product extends BaseModel{
        private String description;
        private String image;
        private int price;

        @ManyToOne
        private Category category;
}
