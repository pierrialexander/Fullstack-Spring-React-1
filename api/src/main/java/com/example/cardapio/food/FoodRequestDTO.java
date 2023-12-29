package com.example.cardapio.food;

public record FoodRequestDTO(String title, String image, Integer price) {
    public FoodRequestDTO(FoodEntity food) {
        this(food.getTitle(), food.getImage(), food.getPrice());
    }
}