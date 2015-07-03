package com.sonaive.decorator;

/**
 * Created by liutao on 15-6-29.
 *
 * Concrete Component
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
