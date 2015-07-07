package com.sonaive.adapter;

/**
 * Created by anzhuo on 15-7-7.
 */
public class AdapterApp {
    public static void main(String[] args) {

        EuroPlug euroPlug = new EuroPlugImpl();
        EuroHotel hotel = new EuroHotel(euroPlug);
        hotel.charge();

        GBPlug gbPlug = new GBPlugImpl();
        Adapter adapter = new Adapter(gbPlug);
        hotel.setPlug(adapter);
        hotel.charge();
    }
}
