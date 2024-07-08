package org.example.demo.api;

public record ProductQuery(
        Long id,
        String name,
        Double price,
        Category category
) {
}
