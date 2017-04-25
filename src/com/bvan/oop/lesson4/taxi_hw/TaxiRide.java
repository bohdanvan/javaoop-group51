package com.bvan.oop.lesson4.taxi_hw;

import com.bvan.oop.common.Immutable;

/**
 * @author bvanchuhov
 */
@Immutable
public class TaxiRide {

    private final int passengers;
    private final int distance;
    private final int duration;

    public TaxiRide(int passengers, int distance, int duration) {
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "TaxiRide{" +
                "passengers=" + passengers +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }
}
