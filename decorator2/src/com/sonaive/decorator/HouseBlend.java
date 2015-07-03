package com.sonaive.decorator;

/**
 * Created by liutao on 15-6-29.
 */
public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
