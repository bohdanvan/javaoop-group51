package com.bvan.oop.lesson4.taxi_hw;

import com.bvan.oop.common.Mutable;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
@Mutable
public class TaxiRides {

    private final List<TaxiRide> rides = new ArrayList<>();

    public void addRide(TaxiRide ride) {
        rides.add(ride);
    }

    public long getPrice(TaxiTariff rate) {
        long price = 0L;

        for (TaxiRide ride : rides) {
            price += rate.calculatePrice(ride);
        }

        return price;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (TaxiRide ride : rides) {
            joiner.add(ride.toString());
        }
        return "Rides:\n" + joiner.toString();
    }
}
