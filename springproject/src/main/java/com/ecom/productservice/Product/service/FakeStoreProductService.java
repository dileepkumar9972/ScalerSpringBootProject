package com.ecom.productservice.Product.service;

import com.ecom.productservice.Product.dto.ProductResponseDTO;
import com.ecom.productservice.Product.models.Category;
import com.ecom.productservice.Product.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements IProductService {

    RestTemplate restTemplate;
    @Override
    public Product getSingleProduct(Long id) {

        RestTemplate restTemplate=new RestTemplate();

        ProductResponseDTO response= restTemplate.getForObject
                (
                        "https://fakestoreapi.com/products/"+id,
                        ProductResponseDTO.class
                );

        return  getProductFromResponseDTO(response);

    }

    private Product getProductFromResponseDTO(ProductResponseDTO response) {

    Product product=new Product();
    product.setId(response.getId());
    product.setName(response.getTitle());
    product.setDescription(response.getDescription());
    product.setPrice((int) response.getPrice());
    product.setCategory(new Category());
    product.getCategory().setName(response.getCategory());
    product.setImage(response.getImage());

    return product;

    }
}
