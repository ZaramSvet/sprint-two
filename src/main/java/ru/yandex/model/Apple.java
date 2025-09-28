package ru.yandex.model;

import java.util.Objects;

import static ru.yandex.model.constants.Colour.COLOUR_RED;
import static ru.yandex.model.constants.Discount.DISCOUNT_FOR_ALL_FOOD;
import static ru.yandex.model.constants.Discount.DISCOUNT_FOR_RED_APPLE;

public class Apple extends Food {
    private final String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        return Objects.equals(color, COLOUR_RED) ?
                DISCOUNT_FOR_RED_APPLE : DISCOUNT_FOR_ALL_FOOD;
    }
}
