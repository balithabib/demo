package org.example.demo.api;

import java.util.Set;

public record OrderQuery(
        String customerName,
        Set<ProductQuery> products
) {
}
