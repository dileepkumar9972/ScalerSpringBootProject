package com.ecom.productservice.Product.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private Long id;
    private String title;
    private float price;
    private String description;
    private String category;
    private  String image;
}
