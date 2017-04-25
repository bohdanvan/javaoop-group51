package com.bvan.oop.lesson4.taxi_hw;

/**
 * @author bvanchuhov
 */
public class FamilyTaxiTariff implements TaxiTariff {

    @Override
    public long calculatePrice(TaxiRide ride) {
        return 30 + 20 * ride.getDistance() / ride.getPassengers();
    }
}
