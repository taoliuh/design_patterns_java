package com.sonaive.decorator;

/**
 * Created by liutao on 15-6-29.
 */
public class DecoratorApp {
    public static void main(String[] args) {
        System.out.println("Client 1 begin to order");
        Beverage beverage = new HouseBlend();
        System.out.println("Client 1 ordered: " + beverage.getDescription() + ", cost: " + beverage.cost());

        System.out.println("Client 2 begin to order");
        beverage = new SoyMilk(beverage);
        System.out.println("Client 2 ordered: " + beverage.getDescription() + ", cost: " + beverage.cost());
    }
}
