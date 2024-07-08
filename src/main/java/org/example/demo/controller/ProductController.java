package org.example.demo.controller;

import org.example.demo.api.ProductQuery;
import org.example.demo.entity.Category;
import org.example.demo.entity.Product;
import org.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(final ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody ProductQuery product) {
        final Product productToSave = new Product();
        productToSave.setName(product.name());
        productToSave.setPrice(product.price());
        productToSave.setCategory(Category.valueOf(product.category().name()));
        return productService.createProduct(productToSave);
    }
}