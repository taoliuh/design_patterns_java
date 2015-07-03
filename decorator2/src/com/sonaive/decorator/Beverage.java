package com.sonaive.decorator;

/**
 * Created by liutao on 15-6-29.
 *
 * Abstract Component
 */
public abstract class Beverage {

    protected String mDescription = "Unknown beverage";

    public String getDescription() {
        return mDescription;
    }

    public abstract double cost();

}
