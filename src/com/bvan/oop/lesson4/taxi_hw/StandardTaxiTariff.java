package com.bvan.oop.lesson4.taxi_hw;

/**
 * @author bvanchuhov
 */
public class StandardTaxiTariff implements TaxiTariff {

    @Override
    public long calculatePrice(TaxiRide ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }
}
