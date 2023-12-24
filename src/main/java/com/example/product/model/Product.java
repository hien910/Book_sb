package com.example.product.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    private String id;
    private String name;
    private String description;
    private int price;
    private String brand;
}