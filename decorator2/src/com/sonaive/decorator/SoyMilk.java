package com.sonaive.decorator;

/**
 * Created by liutao on 15-6-29.
 *
 * Concrete decorator
 */
public class SoyMilk extends CondimentDecorator {

    private Beverage mBeverage;

    public SoyMilk(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Soy Milk";
    }

    @Override
    public double cost() {
        return mBeverage.cost() + .90;
    }
}