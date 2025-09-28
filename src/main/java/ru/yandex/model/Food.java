package ru.yandex.model;

import static ru.yandex.model.constants.Discount.DISCOUNT_FOR_ALL_FOOD;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double getDiscount() {
        return DISCOUNT_FOR_ALL_FOOD;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getVegetarian() {
        return isVegetarian;
    }
}
