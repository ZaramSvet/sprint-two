package ru.yandex;

import ru.yandex.model.Apple;
import ru.yandex.model.Food;
import ru.yandex.model.Meat;
import ru.yandex.service.ShoppingCart;

import static ru.yandex.model.constants.Colour.COLOUR_GREEN;
import static ru.yandex.model.constants.Colour.COLOUR_RED;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100.0);
        Food redApple = new Apple(10, 50.0, COLOUR_RED);
        Food greenApple = new Apple(8, 60.0, COLOUR_GREEN);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        println(String.format("Общая сумма товаров без скидки: " + shoppingCart.getTotalWithoutDiscount()));
        println(String.format("Общая сумма товаров со скидкой: " + shoppingCart.getTotalWithDiscount()));
        println(String.format("Сумма всех вегетарианских продуктов без скидки: " +
                shoppingCart.getTotalVegetariansWithoutDiscount()));
    }

    private static void println(String string) {
        System.out.println(string);
    }
}
